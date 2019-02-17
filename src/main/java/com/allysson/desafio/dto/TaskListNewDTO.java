package com.allysson.desafio.dto;

import java.io.Serializable;

public class TaskListNewDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private String name;
	private String description;
	private Integer state;

	public TaskListNewDTO() {

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

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

}
