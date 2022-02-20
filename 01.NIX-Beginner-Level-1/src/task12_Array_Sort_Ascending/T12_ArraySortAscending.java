package task12_Array_Sort_Ascending;

import java.util.Arrays;

public class T12_ArraySortAscending {
    public static void main(String[] args) {
        int[] arr = {24, 13, -1, 2, 4, 70, 44};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = {24, 13, -1, 2, 4, 70, 44};
        quickSort(arr1, 0, arr1.length - 1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        quickSort(arr2, 0, arr2.length-1);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[10];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (int)Math.round((Math.random()*21)-10); // -10...10
        }
        quickSort(arr3, 0, arr3.length - 1);
        System.out.println(Arrays.toString(arr3));
    }

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
}
