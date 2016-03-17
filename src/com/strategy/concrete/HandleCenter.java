package com.strategy.concrete;

import com.strategy.context.ProjectPublisher;
import com.strategy.iface.IProjectTeamStrategy;

public class HandleCenter {

	public static void main(String[] args) {
		IProjectTeamStrategy iTeamA = new ProjectTeamA();
		IProjectTeamStrategy iTeamB = new ProjectTeamB();
		
		ProjectPublisher projectPublisher = new ProjectPublisher(iTeamB);
		int i = 0;
		while (true) {
			for(int y= Integer.MIN_VALUE; y< Integer.MAX_VALUE; y++){
			}
			if (i%2 ==0) {
				projectPublisher.setProjectTeam(iTeamB);	
			}
			else {
				projectPublisher.setProjectTeam(iTeamA);
			}
			projectPublisher.publishProject();
			i++;
		}
		
	}

}
