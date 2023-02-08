public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {1,454,67,44,3};
        int ans = max(arr);
        System.out.println(ans);
    }
    static int  max(int[] arr){
        int max  = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
