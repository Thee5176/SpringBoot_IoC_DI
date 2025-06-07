package com.thee5176.spring;

import lombok.Getter;

@Getter
public class Score {
	private int wins, losses, ties;

	public Score() {
		this.wins = 0;
		this.losses = 0;
		this.ties = 0;
	}

	public void incrementWins() {
		this.wins++;
	}
}