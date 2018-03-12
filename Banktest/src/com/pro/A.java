package com.pro;

import com.main.Customer;
import com.main.Deposit;

public class A implements Deposit {

    @Override
    public void deposit(Customer c, int amount) {
        double bal=c.getBalance()+amount;
        c.setBalance(bal);
    }

    
}
