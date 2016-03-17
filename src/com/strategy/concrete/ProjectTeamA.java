package com.strategy.concrete;

import com.strategy.iface.IProjectTeamStrategy;

public class ProjectTeamA implements IProjectTeamStrategy {

	@Override
	public void finishProject() {
		System.out.println("ProjectTeamA finish this project.");
	}

}
