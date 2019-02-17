package com.allysson.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.allysson.desafio.domain.TaskList;

@Repository
public interface TaskListRepository extends JpaRepository<TaskList, Integer> {

}
