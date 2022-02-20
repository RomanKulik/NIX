package task08_Multiplication_Table;

public class T08_MultiplicationTableMod {
    public static void main(String[] args) {
        for (int i = 1, j = 1, k = 1; i <= 2; i++) {
            if (i == 2) j = 1;
            for (; j <= 10; j++) {
                k = i == 1 ? 1 : 6;
                for (; i == 1 ? k <= 5 : k <= 10; k++) {
                    System.out.printf("%2d * %-2d = %-3d \t", k, j, k * j);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
