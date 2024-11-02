import java.util.ArrayList;
import java.util.List;

public class Array {

    public static void main(String[] args) {
        int[] arr = {384, 24, 248902, 387};
        int[] arr2 = new int[10];
        for (int i = 0; i < 10; i++) { // beware index out of bounds error
            arr2[i] = i + 11;
        }

        System.out.println(arr2);
        System.out.println("\nELEMS OF ARRAY");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("i" + i + " " + arr2[i]);
        }

        // recall what **generic** is!
        List<String> list1 = new ArrayList();
        List<Integer> list2 = new ArrayList(); // you should type *Integer* not *int*

        for (int i = 11; i <= 20; i++) {
            list2.add(i);
        }
        System.out.println("\nELEMS OF ARRAYLIST");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println("i" + i + " " + list2.get(i));
        }
    }

}
