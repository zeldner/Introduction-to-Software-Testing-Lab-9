package com.business;

import java.util.ArrayList;
import java.util.List;

import com.data.api.Frameworks;

public class ToDoBusinessImpl {
	private Frameworks frameworks;

	public ToDoBusinessImpl(Frameworks frameworks) {
		this.frameworks = frameworks;
	}
	
	public List<String> getReactFrameworks(String user){
		List<String> filtered = new ArrayList<String>();
		List<String> framework = frameworks.getFrameworks(user);
		
		for(String react:framework)
			if(react.contains("React"))
				filtered.add(react);
		return filtered;
	}
	
}
