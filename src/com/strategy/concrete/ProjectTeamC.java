package com.strategy.concrete;

import com.strategy.iface.IProjectTeamStrategy;

public class ProjectTeamC implements IProjectTeamStrategy {

	@Override
	public void finishProject() {
		System.out.println("Project team c finish this project.");
	}

}
