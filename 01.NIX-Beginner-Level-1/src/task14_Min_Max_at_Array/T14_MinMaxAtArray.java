package task14_Min_Max_at_Array;

import java.util.Arrays;

public class T14_MinMaxAtArray {
    public static void main(String[] args) {
        double[] arr = {24, 13, -1, 2, 4, 70, 44};

        double min, max;
        min = Arrays.stream(arr).min().getAsDouble();
        max = Arrays.stream(arr).max().getAsDouble();

        System.out.printf("min = %.0f, max = %.0f%n", min, max);

        double[] arr1 = {24.7, -13.8, -1, 28, 4, -70.4, 44};
        min = arr1[0];
        max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            min = min > arr1[i] ? arr1[i] : min;
            max = max < arr1[i] ? arr1[i] : max;
        }

        System.out.printf("min = %.0f, max = %.0f%n", min, max);
    }
}
