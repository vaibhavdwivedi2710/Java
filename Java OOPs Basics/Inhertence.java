// Inheritance in java 

// base class
class  vehicle{
  String numberOfVehicle;
  public vehicle(String numberofVehicle){
   this.numberOfVehicle = numberofVehicle;
  }
  public void Honk(){
    System.out.println("Honk!!!!!!!!!!");
  }
  public void printNumberOfVehucle(){
    System.out.println(numberOfVehicle);
  }
}

// Derived Class
class Car extends vehicle {
    
    public Car(String numberOfCar){
        super(numberOfCar);
    }
}

class Bus extends vehicle{
  
    public Bus(String numberOfBus){
        super(numberOfBus);
    }
}

public class Inhertence {
  public static void main(String[] args) {
    Car car = new Car("UP74KG3030");
    car.printNumberOfVehucle();;
    car.Honk();

    Bus bus = new Bus("UP74MG6060");
    bus.printNumberOfVehucle();;
    bus.Honk();

    //vehicle vehicle = new vehicle(null);
    // can create object of java class
  }
}