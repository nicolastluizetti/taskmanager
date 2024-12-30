package com.TaskManager.Exception;

public class TaskEmUsoexception extends EntidadeEmUsoException{


	private static final long serialVersionUID = 1L;
	public TaskEmUsoexception(String mensagem) {
		super(mensagem);
		
	}
	public TaskEmUsoexception(Long Id) {
		this(String.format("Não existe um cadastro de tarefa com código %d", Id));
	}

}
