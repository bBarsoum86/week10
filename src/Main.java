//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");


        //creat animal object to test our parent class

        Animal gen = new Animal("garfield", 16);

        String getName = gen.getName();
        System.out.println("here os the animal name:" + getName);
        gen.Speak();

        Dog dog1 = new Dog("oddie", 23);
        String dog1Name = dog1.getName();
        System.out.println("dog's 1 name :" + dog1Name);
        dog1.Speak();


        Animal cat = new Animal("backster", 16);

        String catName = gen.getName();
        System.out.println("here os the animal name:" + getName);
        cat.Speak();

        Dog cat1 = new Dog("backster", 23);
        String cat1Name = dog1.getName();
        System.out.println("dog's 1 name :" + cat1Name);
        dog1.Speak();



    }
}