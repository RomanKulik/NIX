package task03_First_Name_Last_Name;

public class T03_FirstNameLastName {
    public static void main(String[] args) {
        if (args.length == 2) {
            System.out.println(args[0]);
            System.out.println(args[1]);
        } else {
            System.out.println("error: input 2 arguments");
        }
    }
}
