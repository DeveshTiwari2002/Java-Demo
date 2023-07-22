public class JaggedArray {
    public static void main(String[] args) {
        // int nums[][] = new int[3][];
        // nums[0] = new int[4];
        // nums[1] = new int[2];
        // nums[2] = new int[3];
        // nums[0][0] = 3;
        // nums[0][1] = 4;
        // nums[0][2] = 9;
        // nums[0][3] = 13;
        // nums[1][0] = 5;
        // nums[1][1] = 6;
        // nums[2][0] = 7;
        // nums[2][1] = 8;
        // nums[2][2] = 11;

        int nums[][] = {
                { 3, 4, 9, 13 },
                { 5, 6 },
                { 7, 8, 11 }
        };

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

    }
}
