package com.company;

public class PearsonMain {
    public static void main(String[] args) {
        Pearson pearson1 = new Pearson();
        pearson1.setAge(9);
        pearson1.setName("Misha");
        pearson1.characteristics();
        Pearson pearson2=pearson1;
        changePearsonAndPrintParameters(pearson2);

    }
    public static void changePearsonAndPrintParameters(Pearson pearson){
        pearson.setName(pearson.getName()+" Changed") ;
        pearson.setAge(pearson.getAge()+100);
        System.out.println(pearson.getAge());
        System.out.println(pearson.getName());
    }

}
