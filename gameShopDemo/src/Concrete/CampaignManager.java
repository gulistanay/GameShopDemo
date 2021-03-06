package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println("Kampanya eklendi: " + campaign.getName());
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println("Kampanya gŁncellendi: " + campaign.getName());
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Kampanya silindi: " + campaign.getName());
		
	}

}
