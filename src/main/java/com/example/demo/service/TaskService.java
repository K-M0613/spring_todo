package com.example.demo.service;

import java.util.List;
import java.util.Optional; //呼び出し元に対して返す値がないかもしれないことを明示的に伝える

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; //ビジネスロジック（データ処理など）を担当するクラス であることをSpringに伝える。

import com.example.demo.entity.Task;
import com.example.demo.repository.TaskRepository;

@Service
public class TaskService {
	@Autowired
	TaskRepository taskRepository;
	
	//全タスクをリストで取得する
	public List<Task> getAllTasks() {
		return taskRepository.findAll();
	}
	
	//指定した ID のタスクを取得
	//タスクが見つからない場合は null の代わりに Optional.empty() を返す
	public Optional<Task> getTaskById(Integer id) {
		return taskRepository.findById(id);
	}
	
	//タスクを保存（新規作成・更新）
	public Task saveTask(Task task) {
		return taskRepository.save(task);
	}
	
	//タスクを削除
	public void deleteTask(Integer id) {
		taskRepository.deleteById(id);
	}
}
