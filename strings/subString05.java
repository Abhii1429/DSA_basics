package strings;

public class subString05 {
    public static void main(String[] args){
        String s = "abcde";
        System.out.println(s.substring(3)); // de
        // above substring(i) prints 3 and afterwards indices 

        System.out.println(s.substring(1,4)); // bcd

        System.out.println(s.substring(2,2)); // nothing printed

        System.out.println(s.substring(0, 5));
        // 5 is not the upper limit index still it's not showing error because it always takes 1 value less than the upper index
    }
}
