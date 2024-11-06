




public class Animal {
   //instance variable
    private String name;
    private int age;
    private String owner;
    // constructor
    public Animal(String animalName, int animalAge) {
        this.owner ="shelter";
        name = animalName;
        age = animalAge;
    }
    public Animal(String animalName, int animalAge, String owner, String ownerName) {
        name = animalName;
        age = animalAge;
        owner = ownerName;
    }

    public void setName(String animalName){
        name = animalName;
        }
    public String getName(){
        return name;
        }

    public void Speak() {

    }


}
