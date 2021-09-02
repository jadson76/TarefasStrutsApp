package com.jadson.dev.tarefas.infrastructure;

import java.util.List;

import com.jadson.dev.tarefas.domain.Item;
import com.jadson.dev.tarefas.domain.Iteration;
import com.jadson.dev.tarefas.domain.Project;
import com.jadson.dev.tarefas.domain.Task;
import com.jadson.dev.tarefas.infrastructure.dao.DAO;
import com.jadson.dev.tarefas.repository.ProjectRepository;

public class ProjectDecorator implements ProjectRepository {

	private DAO<Project, Integer> projectDao;
	private DAO<Iteration, Integer> iterationDao;
	private DAO<Item, Integer> itemDao;
	private DAO<Task, Integer> taskDao;
	
	public Project save(Project p) {
		if(p.getId() != 0){
			projectDao.merge(p);
		}else {
			projectDao.persist(p);
		}
		return p;
	}
	
	public List<Project> allProjects() {
		List<Project> projects = projectDao.list();
		return projects;
	}
	
	public List<Iteration> allIterations() {
		List<Iteration> list = iterationDao.list();
		return list;
	}
	
	public List<Item> allItens(){
		List<Item> list = itemDao.list();
		return list;
	}
	
	public List<Task> allTasks(){
		List<Task> list = taskDao.list();
		return list;
	}

	public int getNextIdFor(Object object){
		int id = 0;
		
		if(object instanceof Iteration)
			id = iterationDao.getByNamedQuery("Iteration.getLastId", null).getId()+1;
		else if (object instanceof Item)
			id = itemDao.getByNamedQuery("Item.getLastId", null).getId()+1;
		else if (object instanceof Task)
			id = taskDao.getByNamedQuery("Task.getLastId", null).getId()+1;
		
		return id;
	}
	
	public void close() {
		projectDao.close();
	}

	public void remove(Project p) {
		projectDao.remove(p);
	}


	public Project withId(int id) {
		Project p = projectDao.find(id);
		return p;
	}
	
	public void setIterationDao(DAO<Iteration, Integer> dao){
		this.iterationDao = dao;
	}
	
	public void setProjectDao(DAO<Project, Integer> dao){
		this.projectDao = dao;
	}

	public final void setItemDao(DAO<Item, Integer> itemDao) {
		this.itemDao = itemDao;
	}

	public final void setTaskDao(DAO<Task, Integer> taskDao) {
		this.taskDao = taskDao;
	}

}
