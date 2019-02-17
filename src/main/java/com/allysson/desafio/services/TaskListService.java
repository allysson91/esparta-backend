package com.allysson.desafio.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allysson.desafio.domain.TaskList;
import com.allysson.desafio.domain.enums.StateTask;
import com.allysson.desafio.dto.TaskListDTO;
import com.allysson.desafio.dto.TaskListNewDTO;
import com.allysson.desafio.repositories.TaskListRepository;
import com.allysson.desafio.services.exceptions.ObjectNotFoundException;

@Service
public class TaskListService {

	@Autowired
	private TaskListRepository repo;
	
	
	public TaskList find(Integer id) {
		Optional<TaskList> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"\n" + 
				"object not found! Id: " + id + ", Type: " + TaskList.class.getName()));
	}
	
	public List<TaskList> findAll() {
		return repo.findAll();
	}
	
	@Transactional
	public TaskList insert(TaskList obj) {
		obj.setId(null);
		obj = repo.save(obj);
		return obj;
	}
	
	public TaskList update(TaskList obj) {
		// verifica o id se é válido antes de atualizar
		TaskList newObj = find(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
	}
	
	private void updateData(TaskList newObj, TaskList obj) {
		newObj.setName(obj.getName());
		newObj.setDescription(obj.getDescription());
		newObj.setState(obj.getState());
	}
	
	public void delete(Integer id) {
		find(id);
			repo.deleteById(id);
	}
	
	public TaskList fromDto(TaskListDTO objDto) {
		return new TaskList(objDto.getId(), objDto.getName(), objDto.getDescription(), objDto.getState());
	}
	
	public TaskList fromDTO(TaskListNewDTO objDto) {
		TaskList cli = new TaskList(null, objDto.getName(), objDto.getDescription(),  StateTask.toEnum(objDto.getState()));
		return cli;
	}
	
	
	
}
