package task07_Sum_Numbers_of_Integer;

/*
Создайте программу, которая принимает целое число и суммирует его цифры.
Число должно приходить в аргументах

Ввод: 123
Вывод: 6
 */

public class T07_SumNumbersOfInteger {
    public static void main(String[] args) {
        try {
            if (args == null || args.length == 0) {
                System.out.println("ERROR: no arguments");
                return;
            }

            String integer = args[0];

            if (integer.length() == 0) {
                System.out.println("ERROR: string is empty");
                return;
            }

            int sum = 0, i = 0;
            if (integer.substring(i, i + 1).equals("-")) ++i; // if integer is negative

            for (; i < integer.length(); i++) {
                sum += Integer.parseInt(integer.substring(i, i + 1));
            }

            System.out.println(sum);

        } catch (NumberFormatException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }
}
