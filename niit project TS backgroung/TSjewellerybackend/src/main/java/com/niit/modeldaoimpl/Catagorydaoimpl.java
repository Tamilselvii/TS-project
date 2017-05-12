package com.niit.modeldaoimpl;

	import java.util.List;

	import javax.transaction.Transactional;

	import org.hibernate.Query;
	import org.hibernate.SessionFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;

import com.niit.modeldao.Catagorydao.catagorydao;
import com.niit.modeldto.Catagory;

	

	@Repository("catagorydao")
	@Transactional
	public class Catagorydaoimpl implements catagorydao
	{
		@Autowired
		private SessionFactory sessionFactory;
		
		private Catagorydaoimpl(SessionFactory sessionFactory)
		{
			this.sessionFactory=sessionFactory;
		}

		public boolean save(Catagory catagory) 
		{
			try
			{
				sessionFactory.getCurrentSession().save(catagory);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return false;
			}
			return true;
		}

		public boolean update(Catagory catagory) 
		{
			try
			{
				sessionFactory.getCurrentSession().update(catagory);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return false;
			}
			return true;
		}

		public List<Catagory> list() 
		{
			return sessionFactory.getCurrentSession().createQuery("from Catagory").list();
		}

		public boolean delete(String id) 
		{
			try
			{
				sessionFactory.getCurrentSession().delete(getById(id));
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return false;
			}
			return true;
		}

		public Catagory getById(String id) 
		{
			return sessionFactory.getCurrentSession().get(Catagory.class, id);
		}

		public Catagory getByName(String name) 
		{
			Query query=sessionFactory.getCurrentSession().createQuery("from Catagory where name= ?");
			query.setString(0,name);
			return (Catagory) query.uniqueResult();
		}

		public void addcatagory(Catagory catagory) {
			// TODO Auto-generated method stub
			
		}

		public void updatecatagory() {
			// TODO Auto-generated method stub
			
		}

		public void deletecatagory() {
			// TODO Auto-generated method stub
			
		}

		public Catagory getUserByName(String username) {
			// TODO Auto-generated method stub
			return null;
		}

		public List<Catagory> displayAll() {
			// TODO Auto-generated method stub
			return null;
		}

	}



