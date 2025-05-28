package com.thee5176.spring;

import org.springframework.beans.factory.annotation.Autowired;

class Game {
 	@Autowired											//DIに任せる
	Score score;
	
	public void playTheGame() {
		//Score score = spring.getBean(Score.class);	//自分で管理する
		score.incrementWins();
	}
}
