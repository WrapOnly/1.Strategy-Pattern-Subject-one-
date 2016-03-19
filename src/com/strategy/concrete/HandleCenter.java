package com.strategy.concrete;

import com.strategy.context.ProjectPublisher;

public class HandleCenter {

	public static void main(String[] args) {
		ProjectTeamA iTeamA = new ProjectTeamA();
		ProjectTeamB iTeamB = new ProjectTeamB();
		ProjectTeamC iTeamC = new ProjectTeamC();
		
		ProjectPublisher projectPublisher = new ProjectPublisher(iTeamB);
		int i = 0;
		while (true) {
			for(int y= Integer.MIN_VALUE; y< Integer.MAX_VALUE; y++){
			}
			if (i%2 ==1) {
				i++;
				projectPublisher.setProjectTeam(iTeamB);	
			}
			else if (i%2 ==2) {
				i++;
				projectPublisher.setProjectTeam(iTeamA);
			}
			else if (i%2 ==0){
				i++;
				projectPublisher.setProjectTeam(iTeamC);
			}
			projectPublisher.publishProject();
			i= i + 2;
		}
		
	}

}
