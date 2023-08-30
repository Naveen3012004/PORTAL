package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "projects")
public class ProjectModel {
	@Id
	private int project_id;
	private String project_name;
	private String start_date;
	private String end_date;
	private String status;
	private String description;
	public ProjectModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProjectModel(int project_id, String project_name, String start_date, String end_date, String status,
			String description) {
		super();
		this.project_id = project_id;
		this.project_name = project_name;
		this.start_date = start_date;
		this.end_date = end_date;
		this.status = status;
		this.description = description;
	}
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
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
