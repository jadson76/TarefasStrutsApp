package com.jadson.dev.tarefas.repository;

import java.util.List;

import com.jadson.dev.tarefas.domain.Item;
import com.jadson.dev.tarefas.domain.Iteration;
import com.jadson.dev.tarefas.domain.Project;
import com.jadson.dev.tarefas.domain.Task;

public interface ProjectRepository {
	
	public Project save(Project p);
    public void remove(Project p);
    public Project withId(int id);
    public List<Project> allProjects();
    public void close();
	public int getNextIdFor(Object object);
	public List<Iteration> allIterations();
	public List<Item> allItens();
	public List<Task> allTasks();

}
