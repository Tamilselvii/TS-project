package com.niit.modeldto;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int  productid;
	private String productname;
	private String productdesc;
	private String categoryid;
	private int stock;
	public int getStack() {
		return stock;
	}
	public void setStack(int stack) {
		this.stock = stack;
	}
	public String getCategory() {
		return categoryid;
	}
	public void setCategory(String category) {
		this.categoryid = category;
	}
	public String getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(String supplierid) {
		this.supplierid = supplierid;
	}
	private String supplierid;
	private int productcost;
	private boolean enable=true;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductdesc() {
		return productdesc;
	}
	public void setProductdesc(String productdesc) {
		this.productdesc = productdesc;
	}
	public int getProductcost() {
		return productcost;
	}
	public void setProductcost(int productcost) {
		this.productcost = productcost;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	

}
