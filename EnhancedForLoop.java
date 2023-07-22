public class EnhancedForLoop {
    public static void main(String[] args) {
        // FOR ONE DIMENSIONAL ARRAY
        // int nums[] = { 5, 4, 3, 8 };

        // for (int n : nums) {
        // System.out.println(n);
        // }

        // FOR TWO DIMENSIONAL ARRAY

        int nums[][] = {
                { 5, 2, 3, 6 },
                { 8, 3, 6, 4 },
                { 9, 4, 8, 1 }
        };

        for (int a[] : nums) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
