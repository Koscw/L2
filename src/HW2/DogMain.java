package HW2;

public class DogMain {
    public static void main(String[] args) {
        Dog dog1=new Dog("Molly",2,13);

        Dog dog2=new Dog("Po",3,10);
        dog2.setAge(1);
        dog2.setWeight(12);
        dog1.equals(dog2);


    }

}
