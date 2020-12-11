package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String string ="smth";
        String string1="some text";
        String string2 = new String("Test");
        string1=string1+" new string";  //конкратенация; добавление строки к строке
        System.out.println(string);
        System.out.println(string1);
        System.out.println(string2);

        StringBuffer buffer = new StringBuffer("Test ");
        buffer.append(" continue ");
        buffer.append("ttt");
        System.out.println("StringBuffer :"+buffer.toString());

        buffer.reverse();
        System.out.println(buffer);

    }
}
