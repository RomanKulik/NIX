package task10_A_Day_of_the_Week;

public class T10_ADayOfTheWeek {
    public static void main(String[] args) {
        int number = 1 + (int) (Math.random() * 7);

        switch (number) {
            case 1:
                System.out.printf("1 - Понедельник%n1 - Monday%n");
                break;
            case 2:
                System.out.printf("2 - Вторник%n2 - Tuesday%n");
                break;
            case 3:
                System.out.printf("3 - Среда%n3 - Wednesday%n");
                break;
            case 4:
                System.out.printf("4 - Четверг%n4 - Thursday%n");
                break;
            case 5:
                System.out.printf("5 - Пятница%n5 - Friday%n");
                break;
            case 6:
                System.out.printf("6 - Суббота%n6 - Saturday%n");
                break;
            case 7:
                System.out.printf("7 - Воскресенье%n7 - Sunday%n");
                break;
        }
    }
}