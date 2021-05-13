package Entities.Concrete;

import Entities.Abstract.Entity;

public class Game implements Entity{
	private int id;
	private String gameName;
	private String description;
	private int price = 0 ;
	
	public Game () {}

	
	public Game(String gameName, String description, int price) {
		this.gameName = gameName;
		this.description = description;
		this.price = price;
	}


	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	};
	
}
