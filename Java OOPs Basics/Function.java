// function and method in java
class Test{
    public int sum(int num1, int num2){
        return num1 + num2;
    }
}
public class Function {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.sum(15,10));
    }
}
