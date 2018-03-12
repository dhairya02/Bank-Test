package com.pro;

import com.main.Customer;
import com.main.Withdraw;

public class B implements Withdraw {

    @Override
    public void withdraw(Customer c, int amount) {
        double bal= (c.getBalance() - amount);
        c.setBalance(bal);
    
    }
    
}
