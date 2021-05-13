package Entities.Concrete;

import Entities.Abstract.Entity;

public class SalesGame implements Entity{
	private Gamer gamer;
	private Game game;
	private Campaing campaign;
	private int campainingPrice;
	
	public SalesGame(Gamer gamer, Game game, Campaing campaign) {
		super();
		this.gamer = gamer;
		this.game = game;
		this.campaign = campaign;
		this.campainingPrice=game.getPrice()-((game.getPrice()*campaign.getCampaignAmount())/100);
	}
	
	public Gamer getGamer() {
		return gamer;
	}
	public void setGamer(Gamer gamer) {
		this.gamer = gamer;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public Campaing getCampaign() {
		return campaign;
	}
	public void setCampaign(Campaing campaign) {
		this.campaign = campaign;
	}
	public int getCampainingPrice() {
		return campainingPrice;
	}
	

	
	
}
