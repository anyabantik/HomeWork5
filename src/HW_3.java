import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class HW_3 {
    // Необходимо реализовать программу, которая будет считывать
    //числа, введенные пользователем, пока пользователь не введет
    //"stop" слово. по команде "status" необходимо вывести введенные
    //цифры в отсортированном виде (от меньшего к большему).

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        int i;
        String t;
        System.out.println("Введите число:");
        while (true) {
            if (in.hasNextInt()) {
                i = in.nextInt();
                numbers.add(i);
                System.out.println("Введите число:");
            }
            if (in.hasNextLine()) {
                t = in.nextLine();
                if (t.equals("status")) {
                    Collections.sort(numbers);
                    System.out.println("Отсортированный массив:" + numbers);
                }
                if (t.equals("stop")) {
                    break;
                }
            }
        }
    }
}
