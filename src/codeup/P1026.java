package codeup;

import java.util.Scanner;

public class P1026 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        String[] words = line.split(":");
        System.out.println(Integer.valueOf(words[1]));
    }
}
