package strings;

public class interning07 {
    public static void main(String[]args){
        String s = "Raghav";
        String q = "Madhav";
        // Raghav => Madhav
        // s.charAt(0) = 'M'; //Error
        // s.charAt(2) = 'd'; //Error
         s = "Madhav";
         System.out.println(s);
    }
}
