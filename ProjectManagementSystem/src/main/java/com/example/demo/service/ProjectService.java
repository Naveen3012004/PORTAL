package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Project;
import com.example.demo.repository.ProjectRepository;

@Service
public class ProjectService {
	@Autowired
	ProjectRepository pr;
	public Project saveinfo(Project ps) {
		return pr.save(ps);
	}
	public List<Project> showinfo(){
		return pr.findAll();
	}
	public Project showinforeq(int id) {
		return pr.findById(id).orElse(null);
	}
	public void deleteinfo(int id) {
		pr.deleteById(id);
	}
	public Project changeinfo(Project ps) {
		return pr.saveAndFlush(ps);
	}
	public void deleteAll() {
		 pr.deleteAll();
	}
	public String updateinfo(int id,Project ps) {
		java.util.Optional<Project>projectInformation = pr.findById(id);
		if(projectInformation.isPresent()) {
			Project existingProject = projectInformation.get();
			existingProject.setId(ps.getId());
			existingProject.setProjectName(ps.getProjectName());
			existingProject.setProjectDescription(ps.getProjectDescription());
			existingProject.setProjectManager(ps.getProjectManager());
			existingProject.setProjectStatus(ps.getProjectStatus());
			existingProject.setStartDate(ps.getStartDate());
			existingProject.setEndDate(ps.getEndDate());
			existingProject.setBudget(ps.getBudget());
			existingProject.setPriority(ps.getPriority());
			pr.saveAndFlush(existingProject);
			return("Upadated successfully");
		}else {
			return ("Update Failed");
		}
	}
}
