package com.niit.modeldaoimpl;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.niit.modeldto.User;
import com.niit.modeldao.Userdao;

@Transactional
@Repository("userdao")
public class Userdaoimpl implements Userdao {
	@Autowired
	SessionFactory sessionFactory;
	
	public void addUser(User user) {
		Session session = sessionFactory.openSession();
		Transaction transaction = (Transaction) session.beginTransaction();
		session.persist(user);
		transaction.commit();
		session.close();
	}


public void updateUser() {
	// TODO Auto-generated method stub
	
}

public void deleteUser() {
	// TODO Auto-generated method stub
	
}

public User getUserByName(String username) {
	// TODO Auto-generated method stub
	return null;
}
}