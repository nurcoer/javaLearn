package Entities.Concrete;

import Entities.Abstract.Entity;

public class Campaing implements Entity{
	
	private String campaingName;
	private int campaignAmount;
	
	public Campaing(String campaingName, int campaignAmount) {
		super();
		this.campaingName = campaingName;
		this.campaignAmount = campaignAmount;
	}
	public String getCampaingName() {
		return campaingName;
	}
	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}
	public int getCampaignAmount() {
		return campaignAmount;
	}
	public void setCampaignAmount(int campaignAmount) {
		this.campaignAmount = campaignAmount;
	}
}
