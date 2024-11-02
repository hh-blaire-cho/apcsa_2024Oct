import java.util.Scanner;

class Swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two char separated by a space: ");
        String s = sc.nextLine();
        // there can be many methods to solve this problems:

        // #1
        String[] arr = s.split(" ");
        System.out.println(arr[1] + " " + arr[0]);

        // #2
        System.out.println(s.charAt(2) + " " + s.charAt(0));
    }
}