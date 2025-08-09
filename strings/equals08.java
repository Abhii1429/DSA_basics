package strings;

public class equals08 {
    public static void main(String[]args){
        String s = "abcxyz";
        String a = "abcxyz";
        String b = new String(s);
        String c = "abc";
        c = c + "xyz";
        System.out.println(s == b); // compares address of strings
        System.out.println(s == a);

        System.out.println(s.equals(b));// compares contents of strings
        System.out.println(s.compareTo(c)); // 0 => implies here both strings are equal 
    }
}
