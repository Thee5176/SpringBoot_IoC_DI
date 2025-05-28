package com.thee5176.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class SpringFramework {

	public static void main(String[] args) {
		ApplicationContext myContext = new AnnotationConfigApplicationContext(Score.class, Game.class);
		for (int i = 0; i < 5; i++) {
			Score myScore = new Score();
			myScore.incrementWins();
			System.out.println("No IoC: " + myScore.wins);
		}
		
		for (int i = 0; i < 5; i++) {
			Score IocScore = myContext.getBean(Score.class);
			Game game = myContext.getBean(Game.class);
			game.playTheGame();
			System.out.println("IoC   : " + IocScore.wins);
		}

	}
}