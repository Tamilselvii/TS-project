package com.niit.modeldao;
import java.util.List;

import com.niit.modeldto.Product;
public interface Productdao {
	public void addProduct(Product prodid);
	public void updateProduct();
	public void deleteProduct(Product prodid);
	public void retrievecatagory();

public Product getProductByProductName(String username);
public Product getProductByProductid(int prodid);
public List<Product> displayAll();

}
