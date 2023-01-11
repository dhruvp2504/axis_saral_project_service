package com.axis.saral.projectservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.saral.projectservice.entity.Project;
import com.axis.saral.projectservice.repository.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public Project getProjectByProjectIdProject(long ProjectId) {
		
		return projectRepository.findById(ProjectId).get();
	}

	@Override
	public List<Project> getAllProjects() {
		// TODO Auto-generated method stub
		return (List<Project>) projectRepository.findAll();
	}

	@Override
	public void saveProject(Project project) {
		// TODO Auto-generated method stub
		projectRepository.save(project);
		
	}

	@Override
	public void updateProject(long projectId, Project updatedProject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProjectById(long projectId) {
		// TODO Auto-generated method stub
		projectRepository.deleteById(projectId);
		
	}

}
