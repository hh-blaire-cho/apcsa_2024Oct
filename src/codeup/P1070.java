package codeup;

import java.util.Scanner;

public class P1070 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n >= 3 && n <= 5) {
            System.out.println("spring");
        } else if (n >= 6 && n <= 8) {
            System.out.println("summer");
        } else if (n >= 9 && n <= 11) {
            System.out.println("fall");
        } else {
            System.out.println("winter");
        }

    }

}
