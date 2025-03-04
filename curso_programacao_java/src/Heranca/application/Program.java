package Heranca.application;

import Heranca.entities.Account;
import Heranca.entities.BusinessAccount;
import Heranca.entities.SavingAccount;

public class Program {
    public static void main(String[] args) {
        
        
        //Account acc = new Account(1001, "Alex", 0.00);
        //BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 600.0);


        //  UPCASTING
        //Account acc1 = bacc;
        //Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        //Account acc3 = new SavingAccount(1004, "Manu", 0.0, 0.01);

        //  DOWNCASTING
        // BusinessAccount acc4 = (BusinessAccount)acc2;
        //acc4.loan(100.0);


        Account acc1 = new Account(1001, "Alex", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingAccount(1002, "Maria", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Manu", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
        
    }

}
