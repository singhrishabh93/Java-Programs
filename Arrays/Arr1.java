import java.util.Arrays;
import java.util.Scanner;

public class Arr1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
////        arr[0] = 23;
////        arr[1]=25;
////        arr[2]=26;
////        arr[3]=58;
////        arr[4]=89;
////        System.out.println(arr[3]);
//        for(int i=0; i<arr.length ; i++){
//            arr[i]= in.nextInt();
//        }
//        for(int i=0 ; i<arr.length ; i++){
//            System.out.print(arr[i] + " ");
//        }
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i]= in.next();
        }
        System.out.println(Arrays.toString(str));
        str[1]="Rishabh";
        System.out.println(Arrays.toString(str));
    }
}
