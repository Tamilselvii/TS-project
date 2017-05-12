package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.modeldao.Catagorydao;
import com.niit.modeldto.Catagory;
 
 
@Controller
public class CatagoryController 
{
    @Autowired
    Catagorydao catagoryDAO;
     
    @RequestMapping(value="CategoryAddition",method=RequestMethod.GET)
    public String addCategory(@RequestParam("catid") int catid,@RequestParam("catname") String catname,@RequestParam("catdesc") String catdesc,Model m)
    {   
        Catagory catagory=new Catagory();
        catagory.setCatyid(catid);
        catagory.setCatyname(catname);
        catagory.setCatydesc(catdesc);
         
        catagoryDAO.addcatagory(Catagory catagory);
         
        List<Catagory> list=catagoryDAO.displayAll();
        m.addAttribute("catlist",list);
         
        return "Category";
    }
     
    @RequestMapping("Category")
    public String showCategoryPage(Model m)
    {
        List<Catagory> list=catagoryDAO.displayAll();
        m.addAttribute("catlist",list);     
        return "Category";
    }
     
    @RequestMapping(value="deleteCategory/{catid}",method=RequestMethod.GET)
    public String deleteCategory(@PathVariable("catid")int catid,Model m)
    {
        catagoryDAO. deletecatagory();
        List<Catagory> list=catagoryDAO.displayAll();
        m.addAttribute("catlist",list);
        return "Category";
    }
}