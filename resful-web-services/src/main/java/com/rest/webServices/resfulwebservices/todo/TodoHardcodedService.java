package com.rest.webServices.resfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {
	
	private static List<Todo> todos = new ArrayList();
	private static long idCounter= 0;
	
	static {
		todos.add(new Todo(++idCounter,"SistemasDistribuidos","Aprender computacion distribuida",new Date(),false));
		todos.add(new Todo(++idCounter,"SistemasDistribuidos","Aprender Sincronizacion de relojes",new Date(),false));
		todos.add(new Todo(++idCounter,"SistemasDistribuidos","Aprender Cloud Computing",new Date(),false));
	}
	
	public List<Todo> findAll(){
		return todos;
	}
	
	public Todo save(Todo todo) {
		if(todo.getId()==-1 || todo.getId()==0) {
			todo.setId(++idCounter);
			todos.add(todo);
		}
		else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}
	
	public Todo deleteById(long id) {
		Todo todo = findById(id);
		if(todo==null) return null;
		todos.remove(todo);
		return todo;
	}

	Todo findById(long id) {
		for(Todo todo:todos) {
			if(todo.getId()==id) return todo;
		}
		return null;
	}
}
