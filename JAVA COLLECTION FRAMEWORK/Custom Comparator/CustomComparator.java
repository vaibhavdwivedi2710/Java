import java.util.*;

public class CustomComparator {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(4);
        al.add(6);
        al.add(2);
        //Collections.sort(al);
        //sort it in decending order
        Collections.sort(al, new Comparator<Integer>(){
            //[num1, num2]
            @Override
            public int compare(Integer num1, Integer num2){
                //num1<num2
                //order is wrong
                if(num1<num2){
                    return 1;
                }
                else if(num1>num2){
                    return -1;
                }
                return 0;
            }
        });

        //num1<num2 wrong order so return positive value
        //num1>num2 correct order
        Collections.sort(al, (num1, num2) -> num2-num1);
        System.out.println(al);
    }
}
