package com.todoApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todoApplication.bean.ToDoInfo;
import com.todoApplication.bean.User;
import com.todoApplication.storage.CollectionStorage;

@Service
public class ToDoService {
	
	private static int countId=1;

	@Autowired
	private CollectionStorage collectionStorage;
	
	public boolean isUserAuthorized(User user) {
		return collectionStorage.isUserAuthorized(user);
	}
	
	public List<ToDoInfo> getListOfToDos() {
		return collectionStorage.getListOfToDos();
	}
	
	public ToDoInfo getToDo(int id) {
		return collectionStorage.getToDo(id);
	}
	
	public ToDoInfo updateTodo(ToDoInfo toDoInfo) {
		return collectionStorage.updateTodo(toDoInfo);
	}
	
	public void deleteToDo(int id) {
		collectionStorage.deleteToDo(id);
	}
	
	public void addToDo(ToDoInfo toDoInfo) {
		toDoInfo.setId(countId++);
		collectionStorage.addToDo(toDoInfo);
	}
}
