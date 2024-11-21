import java.util.*;
public class String1 {
    // String in java
    public static void main(String[] args) {
        String name = "vaibhav";
        String surname = "Dwivedi";
        System.out.println(name  + " has length: "+ name.length());
        // 0 based indexing 
        System.out.println(name.charAt(2));
        System.out.println(name.substring(2 ));

        //substring

        System.out.println(name.substring(0,4)); // doesnt include end index
        String fullname = name +" "+surname;
        System.out.println(fullname);
        // String is immuatble in java and it create a new object where it is stored
        name+= " "+surname;
        System.out.println(name);

        // equals
        boolean result = name.equals(fullname);
        boolean result1 = name == fullname;
        System.out.println(result); // true or false
        System.out.println(result1); //true or false

        
        //Why String is immutable in java

    }
}
