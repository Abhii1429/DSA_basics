package strings;
import java.util.Scanner;
public class reverseEachWordInSentenceQ7 {
   public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a string:");
     StringBuilder sb = new StringBuilder(sc.nextLine());
     reverse(sb, 0, sb.length()-1);
    //  reverse(sb, 5, 10);
     System.out.println(sb);

     sc.close();
   }
   public static void reverse(StringBuilder sb, int i, int j){
        while(i <= j){
         char temp = sb.charAt(i);
        //  sb.setCharAt(i) = sb.charAt(j); --> not applicable here
         sb.setCharAt(i, sb.charAt(j));
         sb.setCharAt(j, temp);
         i++;
         j--;
        }
   }
}