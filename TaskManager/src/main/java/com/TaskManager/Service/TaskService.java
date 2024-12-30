package com.TaskManager.Service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.TaskManager.Model.Task;
import com.TaskManager.Model.TaskStatus;
import com.TaskManager.repository.TaskRepository;

@Service
public class TaskService {
	private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createTask(Task task) {
        task.setStatus(TaskStatus.pendente);
        task.setCreation(LocalDateTime.now());
        return taskRepository.save(task);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public List<Task> getTasksByStatus(TaskStatus status) {
        return taskRepository.findByStatus(status);
    }

    public Task updateTask(Long id, Task updatedTask) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));
        task.setTitulo(updatedTask.getTitulo());
        task.setDescricao(updatedTask.getDescricao());
        task.setStatus(updatedTask.getStatus());
        task.setConclude(updatedTask.getConclude());
        return taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

}
