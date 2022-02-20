package task16_Find_Duplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T16_FindDuplicates {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 30, 5, 70, 44, 30};
        List<Integer> list1 = new ArrayList();
        findDupls(arr1, list1);
        System.out.println(Arrays.toString(listToArray(arr1, list1)));

        double[] arr = {1, 5, 2, 30, 44, 78, 5, 2, 1};
        List<Double> list = new ArrayList();
        findDupls(arr, list);
        System.out.println(Arrays.toString(listToArray(arr, list)));
    }

    public static double[] listToArray(double[] arr, List list) {
        double[] res = new double[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = (double) list.get(i);
        }
        return res;
    }

    public static int[] listToArray(int[] arr, List list) {
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = (int) list.get(i);
        }
        return res;
    }

    public static void findDupls(int[] arr, List list) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    list.add(arr[i]);
            }
        }
    }

    public static void findDupls(double[] arr, List list) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    list.add(arr[i]);
            }
        }
    }
}
