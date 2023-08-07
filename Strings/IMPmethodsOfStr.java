public class IMPmethodsOfStr {
    public static void main(String[] args) {
        String str = "Pw skill Java";
        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.length());
        System.out.println(str.charAt(1));
        // int length = str.length(); *It is used in real life development*
        System.out.println(str.substring(3, 8));
        System.out.println(str.indexOf("s"));
        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a"));
    }
}
