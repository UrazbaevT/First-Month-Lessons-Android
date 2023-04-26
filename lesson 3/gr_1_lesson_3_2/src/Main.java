import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 8, -4, 46, 0, 111};
        System.out.println(numbers[2]);
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        numbers[4] = 15;
        System.out.println(Arrays.toString(numbers));
        double[] digits = new double[4];
        System.out.println(Arrays.toString(digits));
        digits[2] = 19.12;
        System.out.println(Arrays.toString(digits));
        // digits[5] = 67.9;
        digits = new double[6];
        System.out.println(Arrays.toString(digits));

        int[][] nums2D = new int[3][4];
        System.out.println(Arrays.deepToString(nums2D));
        nums2D[1][2] = -7;
        System.out.println(Arrays.deepToString(nums2D));
        String[][] students = {{"Jyldyz", "Bermet"}, {"Askar", "Tilek"}};
        System.out.println(Arrays.deepToString(students));
    }
}
