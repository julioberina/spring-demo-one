package com.luv2code.springdemo;

public class BasketballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Shoot some hoops, especially 3's";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	// add an init method
	public void doMyStartupStuff() {
		System.out.println("BasketballCoach: inside method doMyStartupStuff");
	}
	
	// add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("BasketballCoach: inside method doMyCleanupStuff");
	}
}
