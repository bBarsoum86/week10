


public class Dog extends Animal {

    public Dog(String dogName, int dogAge){
        super(dogName, dogAge);

    }
    @Override
    public void speak(){
        System.out.println("Bark! Bark!");
    }

}
