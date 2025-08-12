package strings;

import java.util.Arrays;

public class sorting15 {
    public static void main(String[]args){
        String s = "raghav";
        char[] ch = s.toCharArray(); // ch = {'r', 'a', 'g', 'h','a', 'v'} 
           
        for(char ele : ch){
            System.out.print(ele+"");
        }
        System.out.println();

        Arrays.sort(ch);// in built methof=d to sort char array

        for(char ele : ch){
            System.out.print(ele);
        }
        System.out.println();

        // sorting StringBuilder
       StringBuilder sb = new StringBuilder("Rudra");
       char[] arr = sb.toString().toCharArray(); // converting StringBuilder to Char array
       Arrays.sort(arr); 
       for(char ele : arr){
            System.out.print(ele);
        }
    }
}
