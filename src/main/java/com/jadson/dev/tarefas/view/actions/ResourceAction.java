package com.jadson.dev.tarefas.view.actions;

import com.jadson.dev.tarefas.model.Resource;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ResourceAction extends ActionSupport implements ModelDriven {

	private static final long serialVersionUID = -1451948726743344891L;
	
	private Resource res;
	
	{
		res = res == null ? new Resource() : res;
	}
	
	public String SignIn() {
		
		if("".equals(res.getId()) || res.getId().length() < 0) {
			addFieldError("id", "Usuario não encontrado.");
			return INPUT;
		}
		return "logged";
	}

	
	public Resource getModel() {
		return res;
	}

}
