package strings;
import java.util.Scanner;
public class InputStringBuilder11 {
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     // 1st method of taking input in String Builder
    //  String s = sc.nextLine();
    //  StringBuilder sb = new StringBuilder(s);

     // 2nd method of taing input StringBuilder
     System.out.print("Enter string :");
     StringBuilder sb = new StringBuilder( sc.nextLine());
     System.out.println(sb);

     sc.close();
   }
}
