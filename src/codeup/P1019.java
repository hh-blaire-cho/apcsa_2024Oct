package codeup;

import java.util.Scanner;

public class P1019 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] arr = line.split("\\."); // {2013, 8, 5}

        System.out.format("%04d.%02d.%02d", Integer.valueOf(arr[0]), Integer.valueOf(arr[1]), Integer.valueOf(arr[2]));
    }

}


