interface Animal {
void bark();
default void sleep(){
    System.out.println("Sleeping...");
 } 
}
class Dog implements Animal{
  public void bark(){
    System.out.println("Bark!!!");
  }
  @Override
  public void sleep(){
    System.out.println("Dog is Sleeping!!!");
  }

}

class Basics{
    public static void main(String[] args) {
      Dog dog = new Dog();
      dog.bark();
      dog.sleep();  
    }
}
