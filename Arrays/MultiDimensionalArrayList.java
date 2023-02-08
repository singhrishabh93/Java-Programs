import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Initialization part
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arr.add(new ArrayList<>());
        }
        //adding value
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr.get(i).add(in.nextInt());
            }
        }
        System.out.println(arr);
    }
}
