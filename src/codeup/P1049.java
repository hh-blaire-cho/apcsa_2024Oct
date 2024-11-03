package codeup;

import java.util.Scanner;

public class P1049 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
//        int c = sc.nextInt(); error no more integer to parse

        if (a > b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

}
