public class narrowing03 {
    public static void main(String[] args) {
        int b =2;
        short s = (int)b;
        int c = s;
        System.out.println("the value of s is" + c);
    }
}
