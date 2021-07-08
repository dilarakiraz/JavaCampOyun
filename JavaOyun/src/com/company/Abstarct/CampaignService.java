package com.company.Abstarct;
import com.company.Entities.Campaign;
import com.company.Entities.GameRegister;

public interface CampaignService {
    public float Discount(GameRegister gameRegister, Campaign campaign);
}
