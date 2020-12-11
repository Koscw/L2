package com.company;

public class PrimitiveTest {
    public static void main(String[] args) {
        int age =15;
        System.out.println("Age before change:  "+age);

        changeAge(age);
    }
    private static void changeAge(int age){
        System.out.println("Age before changing: "+age);
        age+=100;
        System.out.println("Age after changing: "+age);
    }
}
