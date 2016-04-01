package com.strategy.concrete;

import com.strategy.iface.IProjectTeamStrategy;

public class ProjectTeamB implements IProjectTeamStrategy {

	@Override
	public void finishProject() {
		System.out.println("ProjectTeamB finish this project.");
		
	}

}
