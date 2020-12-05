package com.company;

import java.util.Objects;

public class Pearson {
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public int getAge(){ //геттер
        return age;

    }
    public void setName(String name){ //сеттер
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void characteristics(){
        System.out.println("name of a pearson : "+name+" age of a pearson : "+age);
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pearson pearson = (Pearson) o;
        return age == pearson.age &&
                Objects.equals(name, pearson.name);
    }
    /*
    public boolean equals(Pearson pearson) {
        if (name != null) {
            return super.equals(pearson.name);
        }

        return false;
    }

     */

}
