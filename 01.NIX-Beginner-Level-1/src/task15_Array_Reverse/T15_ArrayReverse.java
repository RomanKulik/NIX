package task15_Array_Reverse;

import java.util.Arrays;

public class T15_ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 30, 5, 70, 44};
        System.out.println(Arrays.toString(arrayReverse(arr)));

        double[] arr1 = {1, 2, 7, 30, 5, 70, 44};
        System.out.println(Arrays.toString(arrayReverse(arr1)));
    }

    public static int[] arrayReverse(int[] arr) {
        int[] res = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            res[j] = arr[i];
        }
        return res;
    }

    public static double[] arrayReverse(double[] arr) {
        double[] res = new double[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            res[j] = arr[i];
        }
        return res;
    }
}
