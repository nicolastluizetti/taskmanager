package com.TaskManager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TaskManager.Model.Task;
import com.TaskManager.Model.TaskStatus;

public interface TaskRepository extends JpaRepository<Task, Long>{
	
	List<Task> findByStatus (TaskStatus taskstatus);

}
