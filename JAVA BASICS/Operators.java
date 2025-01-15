public class Operators {
    public static void main(Strings[] args) {
        
        //Arithematic Operator - (-,+,*,/,%)
        //Example - What will 3%5 = ?
        //3 % 5 equals 3 because 3 is smaller than 5, so the remainder is the number itself.
    

        //Unary Operators (+, -, ++, --, ! )
        boolean fl1 = true;
        boolean fl2 =(!fl1);
        System.out.println(fl2);
        //pre and post increment ++x and x++

        //Relational Operators(==, !=, >, <, >=, <=) usually return true and false
        int num1 = 6;
        int num2 = 7;
        boolean result = num1 == num2;
        System.out.println(result);

        //Logical Operators ( && and || )
        boolean first = true;
        boolean second = false;
        boolean result1 = first && second;
        System.out.println(result1);

        //Assignment operators
        int a = 5;
        int b = 6;
        int result2 = 4;
        //result2 = a+b+result2;
        result2+=a+b;
        int x = 10;
        x += 5; // x = x + 5, so x becomes 15

        //Ternary Operators
        // condition?num1:num2
        int c = 2;
        int d = 3;
        int e = c>d?c:d;
        System.out.println(e);


    }
}
