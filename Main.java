import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите первое число: ");
            double a = scanner.nextDouble();
            System.out.print("Введите второе число: ");
            double b = scanner.nextDouble();
            System.out.printf("Введите число нужного действия \n" +
                    " 1 Сложение \n 2 Вычитание \n 3 Умножение \n 4 Деление ");
            int num = scanner.nextInt();

            double result = 0;

            switch (num) {
                case 1:
                    result = a + b;
                    break;
                case 2:
                    result = a - b;
                    break;
                case 3:
                    result = a * b;
                    break;
                case 4:
                    if (b != 0) {
                        result = a / b;
                    } else {
                        System.out.println("Деление на ноль невозможно.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Неверная операция.");
                    continue;
            }

            System.out.println("Результат: " + result);

            System.out.println("Выполнить еще одну операцию? (да/нет)");
            String response = scanner.next().toLowerCase();

            if (!response.equals("да")) {
                break;
            }
        }

        scanner.close();
    }
}
