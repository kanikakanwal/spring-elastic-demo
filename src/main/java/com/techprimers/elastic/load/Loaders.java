package com.techprimers.elastic.load;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.techprimers.elastic.model.Users;
import com.techprimers.elastic.repository.UsersRepository;

@Component
public class Loaders {
	
	@Autowired
	ElasticsearchOperations operations;
	@Autowired
	UsersRepository usersRepository;
	
	@PostConstruct
	@Transactional
	public void loadAll()
	{
		operations.putMapping(Users.class);
		System.out.println("Loading Data");
		usersRepository.save(getData());
		System.out.println("Loading Completed");
	}

	private List<Users> getData() {
		List<Users> users=new ArrayList<>();
		users.add(new Users("Ajay",123L,"Accounting",12300L));
		users.add(new Users("AKASH",1234L,"Accounting",123000L));
		return users;
		
	}
	

}
