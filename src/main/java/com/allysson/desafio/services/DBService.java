package com.allysson.desafio.services;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allysson.desafio.domain.TaskList;
import com.allysson.desafio.domain.enums.StateTask;
import com.allysson.desafio.repositories.TaskListRepository;

@Service
public class DBService {
	
	@Autowired
	private TaskListRepository taskListRepository;
	
	public void instantiateTestDataBase() throws ParseException {
		
		TaskList task1 = new TaskList(null, "work","work at saturday", StateTask.PENDING);
		TaskList task2 = new TaskList(null, "play","play at monday", StateTask.PENDING);
	
		
		taskListRepository.saveAll(Arrays.asList(task1,task2));
		
	}

}
