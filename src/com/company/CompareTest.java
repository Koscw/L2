package com.company;

public class CompareTest {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 2;
        if (number1 == number2) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
        String string1= "one";
        String string2="one";
        if(string1.equals(string2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        Pearson pearson1= new Pearson();
        pearson1.setName("Sasha");
        Pearson pearson2= new Pearson();
        pearson2.setName("Sasha");
        if (pearson1.equals(pearson2)){
            System.out.println("pearsons are equals");
        } else {
            System.out.println("pesons are not equals");
        }
    }



}
