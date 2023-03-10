package com.axis.saral.projectservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.axis.saral.projectservice.entity.Project;
import com.axis.saral.projectservice.service.ProjectService;

@RestController
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	@GetMapping("/projects")
	public List<Project> getAllProjects(){
		return projectService.getAllProjects();
	}
	
	@GetMapping("/project/{projectId}")
	public Project getProjectByProjectId(@PathVariable long projectId) {
		return projectService.getProjectByProjectIdProject(projectId);
		
		
	}
	
	@PostMapping("/project")
	public ResponseEntity<String> saveProject(@RequestBody Project project){
		projectService.saveProject(project);
		return new ResponseEntity<String>("Project Id",HttpStatus.CREATED);
	}

	@DeleteMapping("/project/{projectId}")
	public ResponseEntity<String> deleteProjectByProjectId(@PathVariable long projectId){
		projectService.deleteProjectById(projectId);
		return new ResponseEntity<String>("Project Id deleted" +projectId,HttpStatus.OK);
		
	}
}
