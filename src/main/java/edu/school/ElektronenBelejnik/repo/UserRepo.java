package edu.school.ElektronenBelejnik.repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import edu.school.ElektronenBelejnik.models.Subject;
import edu.school.ElektronenBelejnik.models.User;

@Repository
public class UserRepo implements IUser {

	private Map<Long, User> users = new HashMap<>();
	private Long id = 0L;
	
	@Override
	public User getUserByID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return new ArrayList<User>(users.values());
	}

	@Override
	public void createUser(User user) {
		// TODO Auto-generated method stub
		user.setId(id++);
		users.put(id, user);
	}

	@Override
	public List<Subject> getAllUsersSubjects() {
		// TODO Auto-generated method stub
		return null;
	}

}
