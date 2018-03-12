package com.main;

public class app {
    public static void main(String[] args) {
        Customer c = new Customer();
        MainScreen m=new MainScreen();
        m.giveCustomer(c);
        m.setVisible(true);
        
    }
    
}
