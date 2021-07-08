package com.company.Abstarct;

import com.company.Entities.Campaign;
import com.company.Entities.GameRegister;
import com.company.Entities.Register;

public interface ProductService {
    public void selling(GameRegister gameRegister, Register register, Campaign campaign);
}
