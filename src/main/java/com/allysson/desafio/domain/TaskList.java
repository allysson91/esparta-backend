package com.allysson.desafio.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.allysson.desafio.domain.enums.StateTask;

@Entity
@CrossOrigin(origins = "*")
public class TaskList implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private String description;
	private Integer state;

	public TaskList() {

	}

	public TaskList(Integer id, String name, String description, StateTask state) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.state = (state==null) ? null : state.getCod();
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
		return StateTask.toEnum(state);
	}

	public void setState(StateTask state) {
		this.state = state.getCod();
	}
	
}
