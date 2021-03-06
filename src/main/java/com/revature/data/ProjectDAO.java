package com.revature.data;

import java.util.Set;

import com.revature.hibernate.beans.Employee;
import com.revature.hibernate.beans.Project;
import com.revature.hibernate.beans.Task;


public interface ProjectDAO {

		// create
		public Project addProject(Project p);
		// read
		public Project getProject(int i);
		public Project getProjectByTask(Task t);
		public Set<Project> getProjects();
		public Set<Project> getProjectsByEmployee(Employee emp);
		// update
		public void updateProject(Project p);
		// delete
		public void deleteProject(Project p);
}
