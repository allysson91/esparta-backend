package com.allysson.desafio.domain.enums;

public enum StateTask {

	PENDING(1, "Pending Activity"), 
	FINISHED(2, "Activity Completed"), 
	EXCLUDED(3, "Activity Excluded");

	private int cod;
	private String description;

	private StateTask(int cod, String description) {
		this.cod = cod;
		this.description = description;
	}

	public int getCod() {
		return cod;
	}

	public String getDescription() {
		return description;
	}

	public static StateTask toEnum(Integer integer) {
		if (integer == null) {
			return null;
		}
		for (StateTask x : StateTask.values()) {
			if (integer.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("id not valid" + integer);
	}

}
