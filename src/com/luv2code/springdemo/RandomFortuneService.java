package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String[] fortunes = { "I see a win in your future", 
								  "Well, today's whatever...", 
								  "Damn, massive L soon!" };
	private Random rand;
	
	public RandomFortuneService() {
		rand = new Random();
	}
	
	@Override
	public String getFortune() {
		return fortunes[rand.nextInt(3)];
	}

}
