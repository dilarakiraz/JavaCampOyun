package com.company.Abstarct;

import com.company.Entities.Register;

public interface RegisterService {
    public void SignUp(Register register);
    public void update(Register register);
    public void delete(Register register);

}
