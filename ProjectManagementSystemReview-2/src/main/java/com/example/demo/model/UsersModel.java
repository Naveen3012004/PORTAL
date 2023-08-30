package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class UsersModel {
	@Id
	private int user_id;
	private String username;
	private String email;
	private String first_name;
	private String last_name;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_project")
	private ProjectModel project;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_task")
	public List<TasksModel> task;

	public UsersModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsersModel(int user_id, String username, String email, String first_name, String last_name,
			ProjectModel project, List<TasksModel> task) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.email = email;
		this.first_name = first_name;
		this.last_name = last_name;
		this.project = project;
		this.task = task;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public ProjectModel getProject() {
		return project;
	}

	public void setProject(ProjectModel project) {
		this.project = project;
	}

	public List<TasksModel> getTask() {
		return task;
	}

	public void setTask(List<TasksModel> task) {
		this.task = task;
	}
	
	
}
