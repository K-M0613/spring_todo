package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.model;
import com.example.demo.entity.Task;

import com.example.demo.service.TaskService;

@Controller
@RequestMapping("/blogs")
public class TaskController {
	@Autowired
	TaskService taskService;

	@GetMapping
	public String listTasks(Model model){
		List<Task> tasks = taskService.getAllTasks();
		model.addattibute('tasks', tasks);
	}
}
