package com.allysson.desafio.dto;

import java.io.Serializable;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.allysson.desafio.domain.TaskList;
import com.allysson.desafio.domain.enums.StateTask;

@CrossOrigin(origins = "*")
public class TaskListDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private String name;
	private String description;
	private StateTask state;

	public TaskListDTO() {

	}
	
	
	public TaskListDTO(TaskList obj) {
		id = obj.getId();
		name = obj.getName();
		description = obj.getDescription();
		state = obj.getState();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public StateTask getState() {
		return state;
	}

	public void setState(StateTask state) {
		this.state = state;
	}

}
