package com.company.Concrete;

import com.company.Abstarct.GameRegisterService;
import com.company.Entities.GameRegister;

public class GameRegisterManager implements GameRegisterService {


    @Override
    public void SignUp(GameRegister gameRegister) {
        if(gameRegister.getNameOfGame().length()<= 0) {
            System.out.println("You have lefted blanked field. Please filling");
        }else {
            System.out.println("Name: "+gameRegister.getNameOfGame()+"\nPrice:\n"+gameRegister.getPrice());
            for (String label: gameRegister.getLabels()) {
                System.out.println(label);
            }
        }
    }

    @Override
    public void Update(GameRegister gameRegister) {
        System.out.println("Game is updated "+gameRegister.getNameOfGame());

    }

    @Override
    public void Delete(GameRegister gameRegister) {
        System.out.println("Game is deleted "+gameRegister.getNameOfGame());

    }
}
