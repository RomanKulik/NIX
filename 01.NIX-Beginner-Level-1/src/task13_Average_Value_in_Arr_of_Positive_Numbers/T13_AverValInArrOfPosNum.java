package task13_Average_Value_in_Arr_of_Positive_Numbers;

import java.util.Arrays;
import java.util.OptionalDouble;

public class T13_AverValInArrOfPosNum {
    public static void main(String[] args) {
        double[] arr = {1, 2, 7, 30, 5, 70, 44};
        OptionalDouble res = Arrays.stream(arr).average();
        System.out.printf("%.3f%n", res.getAsDouble());

        double[] arr1 = {1, 20, 7, 3, 59, 76, 44};
        System.out.println(Arrays.stream(arr1).average().getAsDouble());
        System.out.printf("%.3f%n", average(arr1));
    }

    public static double average(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
