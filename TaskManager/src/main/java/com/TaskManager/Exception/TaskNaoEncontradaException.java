package com.TaskManager.Exception;

public class TaskNaoEncontradaException extends EntidadeNaoEncontradaException{

	private static final long serialVersionUID = 1L;

	public TaskNaoEncontradaException(String mensagem) {
		super(mensagem);
	}

	public TaskNaoEncontradaException(Long Id) {
		this(String.format("Não existe um cadastro de tarefa com código %d", Id));
	}
}
