package task11_Floyd_Triangle;

public class T11_FloydTriangle {
    public static void main(String[] args) {
        if (args == null || args.length == 0) {
            System.out.println("ERROR: no arguments");
            return;
        }

        try {
            int num = Integer.parseInt(args[0]);

            for (int i = 1, j = 0, in = 1; i <= num; i++) {
                for (; j < i; j++, in++) {
                    System.out.printf("%d ", in);
                }
                System.out.println();
                j = 0;
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: wrong number - " + e.getMessage());
        }
    }
}
