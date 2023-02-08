import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntax
        ArrayList<Integer> arr = new ArrayList<>(5);
//        arr.add(10);
//        arr.add(11);
//        arr.add(12);
//        arr.add(13);
//        arr.add(14);
//        arr.add(15);
//
//        System.out.println(arr);
//        System.out.println(arr.contains(13));
//        arr.set(1,52);
//        arr.remove(3);
//        System.out.println(arr);

        //for taking input
        for (int i = 0; i < 5; i++) {
            arr.add(in.nextInt());
        }

        // for printing
        for (int i = 0; i < 5; i++) {
            System.out.println(arr.get(i)); //here list[index] don't work
        }
        //printing another way
        System.out.println(arr);
    }
}
