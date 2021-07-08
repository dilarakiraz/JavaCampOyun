package com.company;

import com.company.Concrete.GameRegisterManager;
import com.company.Concrete.ProductManager;
import com.company.Concrete.RegisterManager;
import com.company.Entities.Campaign;
import com.company.Entities.GameRegister;
import com.company.Entities.Register;

public class Main {

    public static void main(String[] args) {
	Register register=new Register();
	RegisterManager registerManager=new RegisterManager();


	register.setFirstName("Dilara");
	register.setLastName("Kiraz");
	register.setTcNo("123456");
    register.setYearOfBirth("18.10.2000");
	registerManager.SignUp(register);
	registerManager.delete(register);
	registerManager.update(register);


        GameRegister gameRegister=new GameRegister();
        gameRegister.setNameOfGame("Counter-Strike: Global Offensive");
        gameRegister.setPrice(200);


		GameRegisterManager gameRegisterManager=new GameRegisterManager();
		gameRegisterManager.SignUp(gameRegister);
		gameRegisterManager.Delete(gameRegister);
		gameRegisterManager.Update(gameRegister);


		ProductManager productManager=new ProductManager();
		Campaign campaign=new Campaign();
		campaign.setDiscount(50);

		productManager.selling(gameRegister,register,campaign);

    }
}
