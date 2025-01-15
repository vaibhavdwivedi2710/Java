public class ExceptionHandling {
    public static void main(String[] args) {
        // exception handling in java
        try{
            int num1 =10;
            int num2 = 0;
            int num3 = num1/num2;
            System.out.println(num2);
        }
        catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        // catch(ArithmeticException ex){
        //     System.out.println(ex);
        // }

        // finally block will always executed weather there is exception or not
        finally{
            System.out.println("done");
        }
    }
}
