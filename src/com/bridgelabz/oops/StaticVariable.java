package com.bridgelabz.oops;

class Student {
    int rolllno;
    String name;
    static String college = "SRM";
    Student(int r,String n){
        rolllno = r;
        name = n;
    }
    void display(){
        System.out.println(rolllno+" "+name+" "+college);
    }

}

public class StaticVariable {
    public static void main(String[] args) {
        Student s1 =new Student(111,"Aryan");
        Student s2 =new Student(222,"Rahul");

        s1.display();
        s2.display();
    }
}
