package lesson1;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int sum = 0;
        while (!number.equals("стоп")) {
            int num = Integer.parseInt(number);
            sum += num;
            number = scanner.nextLine();
        }
        System.out.println(sum);
    }
}
