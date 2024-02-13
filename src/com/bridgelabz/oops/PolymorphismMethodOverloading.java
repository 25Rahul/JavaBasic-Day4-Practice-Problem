package com.bridgelabz.oops;

class Calculation{
    static  int Add(int a, int b){
        return a+b;
    }
    static  double Add(double a, double b){
        return a+b;
    }
}
public class PolymorphismMethodOverloading {
    public static void main(String[] args) {
        System.out.print(Calculation.Add(4,5));
        System.out.print('\n');
        System.out.print(Calculation.Add(3.5,2.6));
    }
}
