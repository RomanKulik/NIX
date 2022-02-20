package task09_Fibonacci_Numbers;

public class T09_FibonacciNumbers {
    public static void main(String[] args) {
        if (args == null || args.length == 0) {
            System.out.println("ERROR: No arguments");
            return;
        }

        try {
            int num = Integer.parseInt(args[0]);
            //int num = Integer.parseInt("50");

            StringBuilder res = new StringBuilder();
            res.append(0).append(", ").append(1).append(", ");

            int prev = 0, cur = 1, next = 0;
            while (next < num) {
                next = prev + cur;
                if (next < num) {
                    res.append(next).append(", ");
                    prev = cur;
                    cur = next;
                }
            }

            // del last comma
            System.out.println(res.toString().substring(0, res.toString().length() - 2));

        } catch (NumberFormatException e) {
            System.out.println("ERROR: wrong number. " + e.getMessage());
        }
    }
}
