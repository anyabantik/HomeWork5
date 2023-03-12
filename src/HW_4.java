import java.util.Scanner;

public class HW_4 {
    //Необходимо реализовать программу "калькулятор".
    //Поддерживаемые операции +-/* выбор операции и ввод данных
    //осуществляется пользователем с клавиатуры.
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Итого: " + result);
    }

    public static int getInt() {
        System.out.println("Введите число:");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Допущена ошибка при вводе числа. Введите число еще раз.");
            scanner.next();//рекурсия
            num = getInt();
        }
        return num;
    }

    public static char getOperation() {
        System.out.println("Введите операцию (+, -, *, /):");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Допущена ошибка при вводе операции. Введите еще раз (+, -, *, /).");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Повторите ввод.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}

