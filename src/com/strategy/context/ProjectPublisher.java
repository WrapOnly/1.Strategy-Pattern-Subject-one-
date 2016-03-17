package com.strategy.context;

import com.strategy.iface.IProjectTeamStrategy;

public class ProjectPublisher {
	private IProjectTeamStrategy iProjectTeamStrategy;

	public ProjectPublisher(IProjectTeamStrategy iProjectTeamStrategy) {
		super();
		this.iProjectTeamStrategy = iProjectTeamStrategy;
	}
	
	public void publishProject(){
		
		this.iProjectTeamStrategy.finishProject();
	}
	
	public void setProjectTeam(IProjectTeamStrategy _iProjectTeamStrategy){
		this.iProjectTeamStrategy = _iProjectTeamStrategy;
	}
	
}
