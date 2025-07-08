package Array;

import java.util.ArrayList;
public class basicsOfArrayList_02 {
   public static void main(String[]args){
    //  int[] arr = new int[6];
    // double[] brr = {2,14,87,3,5.6};

    ArrayList<Integer> arr = new ArrayList<>(6);
    arr.add(0, 10); // => arr[0] = 10
    arr.add(1, 20);
    arr.add(2, 30); 
    arr.add(3, 40); 
    arr.add(4, 50); 
    arr.add(5, 60); 

    System.out.println(arr.size());

    System.out.println("\n" + arr);

    for(int i = 0; i <= 5; i++){
        System.out.print(arr.get(i) + " "); //=> arr[i]
    }
    System.out.println();

    arr.set(2, 300);//modify

    // for(int i = 0; i < arr.size(); i++){
    //     System.out.print(arr.get(i) + " "); // => arr[i]
    // }
    System.out.println(arr);

    arr.add(98); // push back => adds in the last
    System.out.println(arr.size());
  }
}
