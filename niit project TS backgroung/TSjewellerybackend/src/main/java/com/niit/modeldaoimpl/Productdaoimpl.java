package com.niit.modeldaoimpl;
import java.util.List;

import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.niit.modeldto.Product;



import com.niit.modeldao.Productdao;

@Transactional
@Repository("productdao")

public class Productdaoimpl implements Productdao
{
	@Autowired
	SessionFactory sessionFactory;
	
	public void addProduct(Product product) {
		Session session = sessionFactory.openSession();
		Transaction transaction = (Transaction) session.beginTransaction();
		session.persist(product);
		transaction.commit();
		session.close();
	}


public void updateProduct() {
	// TODO Auto-generated method stub
	
}

public void deleteProduct() {
	// TODO Auto-generated method stub
	
}

public Product getUserByName(String username) {
	// TODO Auto-generated method stub
	return null;
}
public List<Product> displayAll() 
{
	return sessionFactory.getCurrentSession().createQuery("from Product").list();
}


public void retrievecatagory() {
	// TODO Auto-generated method stub
	
}

}


