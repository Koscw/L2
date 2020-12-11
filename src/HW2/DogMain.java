package HW2;

public class DogMain {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.setAge(10);
        dog1.setWeight(23);
        Dog dog2=new Dog();
        dog2.setAge(1);
        dog2.setWeight(12);
        dog1.equals(dog2);

    }

}
