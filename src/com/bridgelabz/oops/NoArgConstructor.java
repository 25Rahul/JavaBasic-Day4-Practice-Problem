package com.bridgelabz.oops;

class Company{
    String name ;
    public Company(){
        name = "Bridgelabz";
    }
}
public class NoArgConstructor {
    public static void main(String[] args) {
        Company obj = new Company();
        System.out.println("Company name = " + obj.name);
    }

}
