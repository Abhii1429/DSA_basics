package strings;
import java.util.Scanner;
public class inputString02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n" + "Enter string :"); // Abhishek Advaith
        // String str = sc.next();// out => Abhishek
        String str = sc.nextLine();
        System.out.println(str);

        sc.close();
    }
}
