package com.axis.saral.projectservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Project {
	
	@Id
	private long projectId;
	private String projectTitle;
	private String startingDate;
	private String deadLineDate;
	private long supervisorId;
	
	
	
	public Project() {
	
	}



	public Project(long projectId, String projectTitle, String startingDate, String deadLineDate, long supervisorId) {
		
		this.projectId = projectId;
		this.projectTitle = projectTitle;
		this.startingDate = startingDate;
		this.deadLineDate = deadLineDate;
		this.supervisorId = supervisorId;
	}



	public long getProjectId() {
		return projectId;
	}



	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}



	public String getProjectTitle() {
		return projectTitle;
	}



	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}



	public String getStartingDate() {
		return startingDate;
	}



	public void setStartingDate(String startingDate) {
		this.startingDate = startingDate;
	}



	public String getDeadLineDate() {
		return deadLineDate;
	}



	public void setDeadLineDate(String deadLineDate) {
		this.deadLineDate = deadLineDate;
	}



	public long getSupervisorId() {
		return supervisorId;
	}



	public void setSupervisorId(long supervisorId) {
		this.supervisorId = supervisorId;
	}



	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectTitle=" + projectTitle + ", startingDate=" + startingDate
				+ ", deadLineDate=" + deadLineDate + ", supervisorId=" + supervisorId + "]";
	}
	
	
	
	


}
