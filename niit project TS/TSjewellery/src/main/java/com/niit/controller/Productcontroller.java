package com.niit.controller;
 
import java.io.*;
import java.util.LinkedHashMap;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.niit.modeldao.Catagorydao;
import com.niit.modeldao.Productdao;
import com.niit.modeldto.Catagory;
import com.niit.modeldto.Product;
 
@Controller
public class Productcontroller 
{
    @Autowired
    Productdao productDAO;
     
    @Autowired
    Catagorydao catagoryDAO;
     
    @RequestMapping(value="Product")
    public String showProduct(Model m)
    {
        Product product = new Product();
        m.addAttribute(product);
         
        List<Product> list=productDAO.displayAll();
        m.addAttribute("proddet",list);
         
        m.addAttribute("catlist",this.getCategories());
        return "Product";
    }
     
    @RequestMapping(value="InsertProduct",method=RequestMethod.POST)
    public String insertProduct(@ModelAttribute("product") Product product,@RequestParam("pimage") MultipartFile filedet,Model m)
    {
        productDAO.addProduct(product);
         
        // Image Uploading Code
        String path = "C:\\ProjectDT17\\MobitelFrontend\\src\\main\\webapp\\resources\\images\\";
         
        path = path + String.valueOf(product.getProductid()) + ".jpg";
         
        File f=new File(path);
         
        if (!filedet.isEmpty()) 
        {
            try
            {
                byte[] bytes = filedet.getBytes();
                FileOutputStream fos=new FileOutputStream(f);
                BufferedOutputStream bs = new BufferedOutputStream(fos);
                bs.write(bytes);
                bs.close();
                 
            }
            catch(Exception e)
            {
                System.out.println("Exception Arised:"+e);
            }
             
        }
        else
        {
            System.out.println("File Uploading Problem");
        }
         
        //Complete Image Uploading
         
        Product product1 = new Product();
        m.addAttribute(product1);
         
        List<Product> list=productDAO.displayAll();
        m.addAttribute("proddet",list);
         
        return "Product";
    }
     
    @RequestMapping(value="deleteProduct/{prodid}",method=RequestMethod.GET)
    public String deleteProduct(@PathVariable("prodid")int prodid,Model m)
    {
         
        productDAO.deleteProduct(Product prodid);
         
        Product product1 = new Product();
        m.addAttribute(product1);
         
        List<Product> list=productDAO.displayAll();
        m.addAttribute("proddet",list);
         
        return "Product";
    }
     
    @RequestMapping(value="updateProduct/{prodid}",method=RequestMethod.GET)
    public String readyUpdate(@PathVariable("prodid")int prodid,Model m)
    {
        Product product=productDAO.addProduct(Product prodid);
        m.addAttribute(product);
         
        List<Product> list=productDAO.displayAll();
        m.addAttribute("proddet",list);
         
        return "UpdateProduct";
    }
     
    @RequestMapping(value="UpdateProduct",method=RequestMethod.POST)
    public String updateProduct(@ModelAttribute("product") Product product,Model m)
    {
        productDAO.updateProduct();
         
        Product product1 = new Product();
        m.addAttribute(product1);
         
        List<Product> list=productDAO.displayAll();
        m.addAttribute("proddet",list);
         
        return "redirect:/Product";
    }
     
    public LinkedHashMap<Integer,String> getCategories()
    {
        List<Catagory> list=catagoryDAO.displayAll();
         
        LinkedHashMap<Integer,String> catlist=new LinkedHashMap<Integer,String>();
         
        for(Catagory cat:list)
        {
            catlist.put(cat.getCatyid(),cat.getCatyname());
        }
         
        return catlist;
    }
}