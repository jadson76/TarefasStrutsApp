package com.jadson.dev.tarefas.model;

import java.io.Serializable;

public class Resource implements Serializable {


	private static final long serialVersionUID = -1874300257756769205L;
	
	private String id;
	
	private String password;

	public final String getId() {
		return id;
	}

	public final void setId(String id) {
		this.id = id;
	}

	public final String getPassword() {
		return password;
	}

	public final void setPassword(String password) {
		this.password = password;
	}
	
	

}
