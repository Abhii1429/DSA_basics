package strings;

public class methodOfStrings04 {
    public static void main(String[] args){
        String s = "Abhishek Pandey ";

        // // indexOf() & .compareTo()
        System.out.println(s.indexOf('z'));
        System.out.println(s.indexOf('e'));
        
        System.out.println(s.lastIndexOf('n'));

        String c = "abc";
        String d = "dbc";
        System.out.println(c.compareTo(d));
        System.out.println();

        // // contains() & startsWith()
        // String x = "Invincible Abhi";
        System.out.println(c.contains("cible"));
        System.out.println(c.contains("vinci"));
        System.out.println(c.contains("vicid"));
        System.out.println(c.contains(" Abhi"));
        System.out.println();

        System.out.println(c.startsWith("Invi")); 
        System.out.println(c.startsWith("Invici")); 
        System.out.println(c.startsWith(" Abhi")); 

        // toLowercaseCase(), toUpperCase() & concat()  :
        String k = "Abhishek studies Computer science";
        // System.out.println(k.toLowerCase());
        // k.toLowerCase(); => this reflects no change

        k = k.toLowerCase(); // updates the value
        System.out.println(k);
        System.out.println(k.toUpperCase());

        String a = "abc";
        String b = "xyz";

        // a.concat(b); => reflects no change
        System.out.println(a.concat(b));
        System.out.println(a);
        a = a.concat(b); // updates the value 
        System.out.println(a);
    }
}
