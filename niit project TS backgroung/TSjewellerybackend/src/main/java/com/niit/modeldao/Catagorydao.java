package com.niit.modeldao;

import java.util.List;

import com.niit.modeldto.Catagory;

public class Catagorydao {
	public interface catagorydao {
		public void addcatagory(Catagory catagory);
		public void updatecatagory();
		public void deletecatagory();
		

	public Catagory getUserByName(String username);

	public List<Catagory> displayAll();

	

	}
}
	
	

	

