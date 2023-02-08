import java.util.Arrays;

public class ArrayFunction {
    public static void main(String[] args) {
        String[] arr = {"r","a","p","g","m"};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(String[] st){
        st[3] ="bb";
    }
}
