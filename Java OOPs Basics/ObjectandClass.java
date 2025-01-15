// classes and objects in java
class Test{
    public void printTest(){
        System.out.println("Printing Test");
    }
}
class ObjectandClass {
    public static void main(String[] args){
        Test test = new Test();
        test.printTest();
        // Test.printTest(); if static is present in printTest
    }
}

class Test1{
    int age;
    public void assignAge(int num){
        age =num;
    }
}
class Basic{
    public static void main(String[] args){
        Test1 test1 = new Test1();
        test1.assignAge(10);

        Test1 test2 = new Test1();
        test2.assignAge(20);

        System.out.println(test1.age);
        System.out.println(test2.age);

    }

}

//public - anywhere
//private - current class
// protected - current package and all other sub package
// static se non static call nhi kr skte
