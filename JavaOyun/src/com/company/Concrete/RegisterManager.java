package com.company.Concrete;

import com.company.Abstarct.RegisterService;
import com.company.Entities.Register;

public class RegisterManager implements RegisterService {
    @Override
    public void SignUp(Register register) {
       if(register.getFirstName().length()<=0 || register.getLastName().length()<=0 || register.getTcNo().length()<=0 || register.getYearOfBirth().length()<=0){
         System.out.println("Do not leave free space");
       }else{
           System.out.println("User name " +" "+register.getFirstName() +" "+ register.getLastName());
       }
    }

    @Override
    public void update(Register register) {
        System.out.println("Register is update"+" "+register.getTcNo());
    }

    @Override
    public void delete(Register register) {
        System.out.println("Register is delete"+" "+register.getTcNo());

    }
}
