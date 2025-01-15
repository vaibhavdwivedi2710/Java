// Basic ploymorphism Example

// base class
class vehicle{
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

      //polymorphism concept - override 
      @Override
      public void Honk() {
        System.out.println("Give me the way!!!");
      }
  }
  
  class Bus extends vehicle{

      public Bus(String numberOfBus){
          super(numberOfBus);
      }
  }


public class Polymorphism {
    public static void main(String[] args) {
        Car car = new Car("UP74KG3030");
        car.printNumberOfVehucle();;
        car.Honk();
    
        Bus bus = new Bus("UP74MG6060");
        bus.printNumberOfVehucle();;
        bus.Honk();
        //Polymorphism feature only we can can create object of base class as well 
        vehicle vl = new vehicle("UP79");
        vl.printNumberOfVehucle();
      }
}
