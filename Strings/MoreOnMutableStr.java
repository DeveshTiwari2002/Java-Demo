import javax.swing.plaf.synth.SynthStyle;

public class MoreOnMutableStr {
    public static void main(String[] args) {
        // StringBuffer sb = new StringBuffer();
        // System.out.println(sb.capacity());
        // StringBuilder sb = new StringBuilder();
        // System.out.println(sb.capacity());
        // sb.append("abcdefghijklmnop");
        // System.out.println(sb.capacity());
        // sb.append("s");
        // System.out.println(sb.capacity()); // CAPACITY: How many character you can
        // add.
        // System.out.println(sb.length()); // LENGTH: How many characters are present.

        // StringBuffer sb2 = new StringBuffer("Devesh");
        // System.out.println(sb2);
        // System.out.println(sb2.capacity());
        // System.out.println(sb2.charAt(1));
        // sb2.setCharAt(1, 'E'); // DEvesh
        // System.out.println(sb2);

        // StringBuilder sb = new StringBuilder(150);
        // System.out.println(sb.capacity());
        // sb.append("Java");
        // System.out.println(sb);
        // sb.trimToSize();
        // System.out.println(sb.capacity());

        StringBuilder sb = new StringBuilder("Pwjava");
        System.out.println(sb);
        System.out.println(sb.reverse());

    }
}
