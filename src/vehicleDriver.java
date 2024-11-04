public class vehicleDriver {

    public static void main (String [] args){
        System.out.println("testing our vehicles calsses");
        Car car1 = new Car();
        car1.speed = 80;
        car1.move();
        car1.honk();

        Bicycle bike1 = new Bicycle();
        bike1.speed = 15;
        bike1.move();
        bike1.ringBell();

    }
}
