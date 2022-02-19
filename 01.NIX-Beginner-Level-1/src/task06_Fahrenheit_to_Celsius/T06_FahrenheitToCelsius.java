package task06_Fahrenheit_to_Celsius;


import java.util.Scanner;

/*
Ввод: 41
Вывод: 5
 */
public class T06_FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double temper;
        try {
            temper = Double.parseDouble(in.nextLine());
            System.out.println((int)((temper-32)/1.8));
        } catch (NumberFormatException e){
            System.out.println("ERROR: Wrong number. Use numbers and '.' as a separator");
            System.out.println(e.getMessage());
        }
    }
}
