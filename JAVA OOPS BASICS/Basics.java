class Vechile {
    String numberOfVechile;
    public Vechile(String numberOfVechile){
     this.numberOfVechile =numberOfVechile;
    }
    
    public void Honk(){
        System.out.println("Honk!!!!!");
    }

    public void printNumberOfVehucle(){
        System.out.println(numberOfVechile);
    }
 
}
class Bus extends Vechile {
    public Bus(String numberOfBus) {
        super(numberOfBus);
    }
}

class Car extends Vechile{
    public Car(String numberOfCar) {
        super(numberOfCar);
    }
}

public class Basics{
 public static void main(String[] args) {
    Bus bus = new Bus("UP74");
    bus.printNumberOfVehucle();
    bus.Honk();

    Car car = new Car("UP78");
    car.printNumberOfVehucle();
    car.Honk();
 }
}
