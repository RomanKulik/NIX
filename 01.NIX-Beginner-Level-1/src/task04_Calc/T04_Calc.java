package task04_Calc;

/*
Создайте программу, которая
складывает / перемножает / вычитает / делит
два числа и выводит на экран результат.
Оба числа и желаемая операция должны приходить в аргументах

Ввод: 12 40 sum
Вывод: 52

 */

import java.util.Scanner;

public class T04_Calc {
    public static void main(String[] args) {
        if (args == null || args.length != 3) {
            System.out.println("ERROR: Incorrect input: input 3 arguments");
            return;
        }

        /*System.out.println("Input numbers and operation (sum, mul, ded, div).");
        System.out.println("Example: 12.5 40 sum");
        Scanner scanner = new Scanner(System.in);
        String[] args = scanner.nextLine().split(" ");*/

        if (args[2].equals("sum") ||
                args[2].equals("mul") ||
                args[2].equals("ded") ||
                args[2].equals("div")) {

            double n1, n2;
            try {
                n1 = Double.parseDouble(args[0]);
                n2 = Double.parseDouble(args[1]);
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Incorrect input - not a number: use numbers, like 12.5 40 and . as a separator");
                return;
            }

            switch (args[2]) {
                case "sum":
                    System.out.println((int) (n1 + n2));
                    break;
                case "mul":
                    System.out.println((int) (n1 * n2));
                    break;
                case "ded":
                    System.out.println((int) (n1 - n2));
                    break;
                case "div":
                    if (n2 == 0) {
                        System.out.println("ERROR: Division by zero!");
                        return;
                    }
                    System.out.println((int) (n1 / n2));
                    break;
            }
        } else {
            System.out.println("ERROR: Incorrect input - use: sum, mul, ded, div");
            return;
        }
    }
}
