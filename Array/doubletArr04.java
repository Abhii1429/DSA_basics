package Array;

public class doubletArr04 {
    public static void main(String[]args){
        int[] arr ={2,4,6,5,3,4,1,2};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == 8){
                    System.out.print("doublets are "+ i +" "+ j);
                }
                System.out.println();
            }
        }
    }
}
