package task05_Array;

public class T05_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7, 15};

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i] + ",");
        }
    }
}
