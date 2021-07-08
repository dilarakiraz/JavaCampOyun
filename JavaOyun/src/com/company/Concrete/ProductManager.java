package com.company.Concrete;

import com.company.Abstarct.ProductService;
import com.company.Entities.Campaign;
import com.company.Entities.GameRegister;
import com.company.Entities.Register;

public class ProductManager implements ProductService {
    @Override
    public void selling(GameRegister gameRegister, Register register, Campaign campaign) {
        CampaignManager campaignManager = new CampaignManager();
        float newPrice = 0;
        newPrice = campaignManager.Discount(gameRegister, campaign);
        if(newPrice == gameRegister.getPrice()) {
            System.out.println("This game is not campaing product");
            System.out.println("Name: "+gameRegister.getNameOfGame()+"\nPrice: "+gameRegister.getPrice());
        }else {
            System.out.println("This game is  campaing product");
            System.out.println("Name: "+gameRegister.getNameOfGame()+"\nNew Price: "+newPrice);
        }
        System.out.println(gameRegister.getNameOfGame()+" "+"has been selled to"+" "+register.getFirstName());
        System.out.println("Shopping Detail\n"+"Buyer: "+register.getFirstName()+"\nSeller:\n"+"\nPrice:\n"+gameRegister.getPrice()+"\nContent:\n"+gameRegister.getContent());
    }
    }

