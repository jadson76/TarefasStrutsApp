package com.jadson.dev.tarefas.view.actions;

import com.jadson.dev.tarefas.domain.User;
import com.jadson.dev.tarefas.repository.UserRepository;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven {

	private static final long serialVersionUID = -4388844209601640607L;
	private UserRepository repository;
	private User user;

	
	{
		user = user == null ? new User() : user;
	}

	public String signIn(){
		
		if(!user.isElegibleForLogin()){
			addFieldError("login", "Por favor, entre com o Login!");
			return INPUT;
		}
		
		user = repository.userWithLogin(user.getLogin(), user.getPassword());
		if(user == null){
			addFieldError("login", "Usuario não encontrado!");
			return INPUT;
		}
		
		return "logged";
	}

	public User getModel() {
		return user;
	}

	public void setRepository(UserRepository repository) {
		this.repository = repository;
	}

}
