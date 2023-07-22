class Calc {
    public int add(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }

}

public class Demo {
    public static void main(String[] args) {
        Calc obj = new Calc();
        int result = obj.add(n1:4, n2:3);
        System.out.println(result);
    }
}
