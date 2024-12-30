package com.TaskManager.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Task {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	public Long id;
	
	private String descricao;
	
	private String titulo;
	
	private LocalDateTime creation;
	
	private LocalDateTime conclude;
	
	@Enumerated
	private TaskStatus status;

}
//{
//	"titulo":"estudar",
//    "descricao":"Spring",
//    "conclude":2024-12-31T23:59:59
//}
