package task17_Intersection_in_Two_Arrays_of_Numbers;

import java.util.Arrays;

public class T17_IntersectionInTwoArraysOfNumbers {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 7, 30, 5, 70, 44};
        int[] arr2 = {1, 4, 17, 30, 28, 99};

        System.out.println(Arrays.toString(
                intersecInTwoArrsOfNums(arr1, arr2)));

        int[] arr3 = {1, 2, 7, 4, 30, 5, 70, 44, 88};
        int[] arr4 = {1, 4, 7, 30};

        System.out.println(Arrays.toString(
                intersecInTwoArrsOfNums(arr3, arr4)));
    }

    public static int[] intersecInTwoArrsOfNums(int[] arr1, int[] arr2) {
        int minSize = Math.min(arr1.length, arr2.length);

        int count = 0;
        for (int i = 0; i < minSize; i++) {
            if (arr1[i] == arr2[i]) count++;
        }

        int[] res = new int[count];
        for (int i = 0, j = 0; i < minSize; i++) {
            if (arr1[i] == arr2[i])
                res[j++] = arr1[i];
        }

        return res;
    }
}
