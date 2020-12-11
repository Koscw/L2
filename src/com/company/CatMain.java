package com.company;

public class CatMain {
        public static void main(String[] args) {
                cat cat1=new cat();
                cat cat2=new cat();
                cat1.color="black";
                cat1.name="tommy";
                cat1.characteristics();
                System.out.println(cat1);
                System.out.println(cat2);
                cat anothercat=new cat();//новый кот
                cat cat4 = anothercat; //ссылка на кота (! не новый кот! )

        }


}
