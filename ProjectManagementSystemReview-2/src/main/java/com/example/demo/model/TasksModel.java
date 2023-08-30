package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tasks")
public class TasksModel {
	@Id
	private int task_id;
	private String task_name;
	private String start_date;
	private String due_date;
	private String status;
	private String description;
	public TasksModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TasksModel(int task_id, String task_name, String start_date, String due_date, String status,
			String description) {
		super();
		this.task_id = task_id;
		this.task_name = task_name;
		this.start_date = start_date;
		this.due_date = due_date;
		this.status = status;
		this.description = description;
	}
	public int getTask_id() {
		return task_id;
	}
	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}
	public String getTask_name() {
		return task_name;
	}
	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getDue_date() {
		return due_date;
	}
	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
