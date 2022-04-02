package lesson2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        String[] strings = numbers.split(" ");
        int[] subsequence = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            subsequence[i] = Integer.parseInt(strings[i]);
        }
        boolean increasing = true;
        for (int i = 0; i < subsequence.length - 1; i++) {
            if (subsequence[i] > subsequence[i + 1]) {
                increasing = false;
                break;
            }
        }
        if (increasing) {
            System.out.println("возрастающая");
        } else {
            System.out.println("не возрастающая");
        }
    }
}
