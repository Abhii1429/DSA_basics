package strings;

public class stringArray16 {
    public static void main(String[] args){
        // string array
        String[] arr = {"abhishek","btech","laptop"};
        // System.out.println(arr); // prints address of array in heap memory
        for(String ele : arr){
            System.out.println(ele);
        }
    }
}
