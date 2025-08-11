package strings;

public class stringBuider09 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb.length());

        StringBuilder x = new StringBuilder(""); // empty stringBuilder
        System.out.println(x.length()); // 0
        System.out.println(x.capacity()); // default capacity => 16

        StringBuilder y = new StringBuilder(10); // capacity of stringBuilder is 10
       System.out.println(y.capacity());

       String s = "abc";
       StringBuilder ssb = new StringBuilder(s); // string to stringBuilder
       System.out.println(ssb);
    }
}
