package com.todoApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.todoApplication.bean.ToDoInfo;
import com.todoApplication.bean.User;
import com.todoApplication.service.ToDoService;

@Controller
public class ToDOController {

	@Autowired
	private ToDoService toDoService;
	
	@GetMapping("/")
	public String loginPage(@ModelAttribute User user,Model model) {
		return "login";    // /WEB-INF/views/login.jsp
	}
	
	@GetMapping("logout")
	public String logout(@ModelAttribute User user,Model model) {
		model.addAttribute("message","You logout successfully");
		return "login";
	}
	
	@PostMapping("login")
	public String welcomePage(@ModelAttribute User user,Model model) {
		if(toDoService.isUserAuthorized(user)) {
			return "welcome";
		}
		model.addAttribute("message","UserName and Password is incorrect");
		return "login";
	}
	
	@GetMapping("home")
	public String welcome() {
		return "welcome";
	}
	
	@GetMapping("list-todos")
	public String getListOfTodos(Model model) {
		List<ToDoInfo> listTodos = toDoService.getListOfToDos();
		model.addAttribute("listTodos",listTodos);	
		return "list-todos";
	}
	
	@GetMapping("delete-todo")
	public String deleteToDo(@RequestParam int id){
		toDoService.deleteToDo(id);
		return "redirect:/list-todos";
	}
	
	@GetMapping("addTodo")
	public String addToDo(@ModelAttribute ToDoInfo toDoInfo) {
		return "todo";
	}
	
	@PostMapping("addTodo")
	public String addToDos(@ModelAttribute ToDoInfo toDoInfo) {
		System.out.println("post method");
		toDoService.addToDo(toDoInfo);
		return "redirect:/list-todos";
	}
	
	@GetMapping("updateTodo")
	public String updateTodo(@ModelAttribute ToDoInfo toDoInfo,@RequestParam int id) { 
		ToDoInfo toDoInfo2 = toDoService.getToDo(id);
		toDoInfo.setDesc(toDoInfo2.getDesc());
		toDoInfo.setTargetDate(toDoInfo2.getTargetDate());
		toDoInfo.setDone(toDoInfo2.isDone());
		return "todo";
	}
	
	@PostMapping("updateTodo")
	public String updateTodos(@ModelAttribute ToDoInfo toDoInfo) {
		toDoService.updateTodo(toDoInfo);
		return "redirect:/list-todos";
	}
	
}
