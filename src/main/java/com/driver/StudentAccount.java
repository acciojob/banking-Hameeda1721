package com.driver;

public class StudentAccount extends BankAccount{

    String  institutionName;

    public StudentAccount(String name, double balance, String  institutionName) {
        //minimum balance is 0 by default
        super();
        this.setName(name);
        this.setBalance(balance);
        this.setInstitutionName(institutionName);
        this.setMinBalance(0);

    }

    private void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

}
