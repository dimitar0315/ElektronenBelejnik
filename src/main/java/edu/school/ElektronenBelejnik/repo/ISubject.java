package edu.school.ElektronenBelejnik.repo;

import java.util.List;

import edu.school.ElektronenBelejnik.models.Subject;
import edu.school.ElektronenBelejnik.models.User;

public interface ISubject {
	
	public Subject getSubjectbyID();
	public List<Subject> getAll();
	public Subject getByID();
	public Subject createSubject();
	public List<User> getAllUsersBySubject();
	

}
