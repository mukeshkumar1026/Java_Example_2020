package com.OOPsConceptPart2;

public class HSBCBank implements USBank, BrazilBank {

    //if class implement any interface then it's defined the method orverriden all method interface

//IS-A relationship

    public void credit(){

        System.out.println("hsbc---credit");
    }
    public void debit(){
        System.out.println("hsbc---debit");
    }

    public void transferMoney(){

        System.out.println("hsbc----transferMoney");
    }
    public void EducationLoan(){
        System.out.println("hsbc----educationloan");
    }
    public void CarLoan(){
        System.out.println("hsbc---CarLoan");
    }

    public void mutualFund(){
        System.out.println("hsbc------brazilbank mutualFund");
    }
    
}
