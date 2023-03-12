import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class HW_2 {
    //Необходимо реализовать программу, которая будет считывать
    //числа (целые), введенные пользователем, пока пользователь
    //не введет "stop" слово. После чего программа выведет среднее
    //из всех введенных значений.


    public static void main(String[] args) {
        int count = 0;
        int summa = 0;
        String i;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        while (true) {
            if (in.hasNextInt()) {
                summa += in.nextInt();
                count++;
            }
            if (in.hasNextLine()){
                if (in.nextLine().equals("stop") && summa > 0) {
                    System.out.println((double) summa / count);
                    break;
                }
            }
        }
    }
}
