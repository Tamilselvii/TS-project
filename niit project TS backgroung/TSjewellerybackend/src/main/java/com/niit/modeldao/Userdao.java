package com.niit.modeldao;

import com.niit.modeldto.User;

public interface Userdao {
	public void addUser(User user);
	public void updateUser();
	public void deleteUser();
public User getUserByName(String username);
	

}
