package Loops;

import java.util.Scanner;

public class Pattern7 {
    public static void inverted_half_pyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows you want:");
        int number = sc.nextInt();
        inverted_half_pyramid(number);

    }
}

