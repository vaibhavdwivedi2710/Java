public class Array {
    public static void main(String[] args) {
        int [] arr=new int[5];
        int[] arr1= {1,2,3,4,};
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        arr[3]=3;
        arr[4]=4;
        System.out.println(arr[4]);
        System.out.println(arr[8]); //Run time error
        // run time error occurs when we try to access inaccessable memory location
        // for array length
        System.out.println(arr.length);

        //2-D array
        int [][]arr3  ={{1,2},{3,4},{5,6,7}};
        int [] zeroIndex = arr3[0];
        System.out.println(zeroIndex);
        System.out.println(arr3[0][1]); //2
        System.out.println(arr3[2][2]); //7

    }
}
