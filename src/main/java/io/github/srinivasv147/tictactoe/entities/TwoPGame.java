package io.github.srinivasv147.tictactoe.entities;

import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class TwoPGame {
	
	@Id
	Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "xUser_id")
	User xUser;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "oUser_id")
	User oUser;
	
	String gameState;//comma separated game state. for simple games this is fine
	
	Boolean result;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getxUser() {
		return xUser;
	}

	public void setxUser(User xUser) {
		this.xUser = xUser;
	}

	public User getoUser() {
		return oUser;
	}

	public void setoUser(User oUser) {
		this.oUser = oUser;
	}

	public String getGameState() {
		return gameState;
	}

	public void setGameState(String gameState) {
		this.gameState = gameState;
	}

	public Boolean getResult() {
		return result;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}
	
	
}
