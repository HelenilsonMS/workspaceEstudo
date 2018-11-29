package com.estudo.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoServive {
	
	
	private static List<User> users = new ArrayList<>();
	
	
	private static int usersCount = 3;
	
	static {
		users.add(new User(1, "Adam", new Date()));
		users.add(new User(2, "Eve", new Date()));
		users.add(new User(1, "Jack", new Date()));
	}

	public List<User> findAll(){
		return users;
	}
	
	public User save(User user) {
		
		if (user.getId() != null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return  user;
	}

	public User findOne(int id) {
		for (User user : users) {
			if (user.getId() == id ) {
				return user;
			}
		}
		return null;
	}
	
	
	public User deleteById (int id) {
		
		Iterator<User> iterador = users.iterator();
		
		while (iterador.hasNext()) {
			User user = (User) iterador.next();
			if (user.getId() == id ) {
				
				iterador.remove();
				return user;
			}
		}
		return null;
	}
	 	
	
}
