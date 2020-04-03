package com.OOPsConceptPart2;

public class TestBank {

    public static void main(String[] args) {

        System.out.println(USBank.min_bal);

        HSBCBank hs=new HSBCBank();
        hs.credit();
        hs.debit();
        hs.transferMoney();
        hs.EducationLoan();
        hs.CarLoan();
        hs.mutualFund();
        //dnamic polymorphism
        //child class not be refer a parent class reference variable
        USBank b=new HSBCBank();
        b.credit();
        b.debit();
        b.transferMoney();
    }
}
