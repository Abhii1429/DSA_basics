package strings;

public class insertAndDelete14 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("abcdef");
        System.out.println(sb);
        // delete
        sb.deleteCharAt(3);// deletes a specific index
        System.out.println(sb);
        sb.append("xyz");
        System.out.println(sb); // abcefxyz, cefx => (2,5)
        sb.delete(2,6); // deletes characters from 2 to 5
        System.out.println(sb); // abyz

        // insert : abyz -> abgyz
        // sb.insert(2, 67); // number// output => aby67z
        // sb.insert(3,'c'); // char // abycz
        sb.insert(2, "svg"); // string
        System.out.println(sb);

        // revers()
        sb.reverse();
        System.out.println(sb);
    }
}
