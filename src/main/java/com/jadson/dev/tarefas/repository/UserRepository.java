package com.jadson.dev.tarefas.repository;

import java.util.List;

import com.jadson.dev.tarefas.domain.User;

public interface UserRepository {
	
	public User save(User u);
	public void remove(User u);
    public User userWithId(int id);
    public User userWithLogin(String login, String password);
    public List<User> allUsers();

}
