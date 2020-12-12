package HW2;

import com.company.Pearson;

import java.util.Objects;

public class Dog {

    private String name;
    private  int age;
    private int weight;
    public Dog(String name,int age, int weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() { //геттер
        return age;

    }

    public  int getWeight() { //геттер
        return weight;

    }

    public void setName(String name) { //сеттер
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int age) {
        this.weight = weight;
    }





   public boolean equals(Dog dog){
       return this.weight>dog.weight&&this.age>dog.age;


   }


//если вес равен весу и возвраст равен возрасту вывести тру
    //else false

}
