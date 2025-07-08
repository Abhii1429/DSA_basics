package Array;

public class passingArrIntoMethod {
  public static void main(String []args){
  
    // Primitive type variable
      // int x = 5;
  //   System.out.println(x);
  //   change(x);
  //   System.out.println(x);
  // }
  // public static void change(int x){
  //   x = 10;
  //   System.out.println(x);
  // }
  //why does the output is 5,10,5?? think about its dry run

  int[] arr = {10,20,30,40};
  System.out.println(arr[0]);
  change(arr);
  System.out.println(arr[0]);
  }

  public static void change(int[] x){
    // arr[0] =  90;
    x[0] = 90;
  }
}
