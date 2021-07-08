package com.company.Abstarct;

import com.company.Entities.GameRegister;

public interface GameRegisterService {
    public void SignUp(GameRegister register) ;
    public void Update(GameRegister register);
    public void Delete(GameRegister register);
}
