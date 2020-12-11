package HW2;

import com.company.Pearson;

import java.util.Objects;

public class Dog {
    private String name;
    private static int age;
    private static int weight;


    public String getName() {
        return name;
    }

    public int getAge() { //геттер
        return age;

    }

    public static int getWeight() { //геттер
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


/*
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Dog dog1 = (Dog) o;


        if (getWeight() != Dog.getWeight()) {
            return false;
        }
        return false;


    }

 */
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pearson pearson = (Pearson) o;
        return age == Dog.age &&
                Objects.equals(name, Dog.weight);
    }

}
