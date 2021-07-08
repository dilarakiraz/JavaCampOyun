package com.company.Concrete;

import com.company.Abstarct.CampaignService;
import com.company.Entities.Campaign;
import com.company.Entities.GameRegister;

public class CampaignManager  implements CampaignService {

    @Override
    public float Discount(GameRegister gameRegister, Campaign campaign) {
        float newPrice=0;
        for(String label:gameRegister.getLabels()){
            if(label=="Action"){
                newPrice=gameRegister.getPrice()*(campaign.getDiscount()/100);
                System.out.println("This is campaign");
            }else{
                newPrice=gameRegister.getPrice();
            }
        }

        return newPrice;
    }
}
