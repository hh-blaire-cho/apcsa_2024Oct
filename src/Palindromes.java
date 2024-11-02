import java.util.Scanner;

public class Palindromes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        if (isLong(text) >= 15){
            System.out.println("This String is too long"); //15자 이상이면
        } else {
            System.out.println("This String is too short "); //15자 미만이면
        }
    }

    public static int isLong(String text){
        return text.length();
    }
}
