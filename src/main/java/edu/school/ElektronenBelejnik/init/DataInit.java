package edu.school.ElektronenBelejnik.init;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import edu.school.ElektronenBelejnik.models.User;
import edu.school.ElektronenBelejnik.repo.IUser;

public class DataInit implements CommandLineRunner {
	
	
	private static final List<User> DATA = List.of(
			new User(null, null, null, 0, null, null, null),
			new User(null, null, null, 0, null, null, null),
			new User(null, null, null, 0, null, null, null)
			);
	@Autowired
	private IUser repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
