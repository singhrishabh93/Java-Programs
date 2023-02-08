import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i <3 ; i++){
            for (int j = 0; j< arr[i].length ; j++) {
                arr[i][j] = in.nextInt();
            }
        }
// for printing arrays as usual

        for (int i = 0; i <3 ; i++){
            for (int j = 0; j< arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
//        for printing using Arrays.toSting() method
        for (int i = 0; i <3 ; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}
