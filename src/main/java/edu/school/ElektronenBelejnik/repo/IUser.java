package edu.school.ElektronenBelejnik.repo;

import java.util.List;

import edu.school.ElektronenBelejnik.models.Subject;
import edu.school.ElektronenBelejnik.models.User;

public interface IUser {
	User getUserByID();
	List<User> getAllUsers();
	void createUser(User user);
	List<Subject> getAllUsersSubjects();
	
	

}
