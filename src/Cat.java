
public class Cat extends Animal {

    public Cat(String catName, int catAge){
        super(catName, catAge);

    }
    @Override
    public void speak(){
        System.out.println("meau! meau!");
    }

}