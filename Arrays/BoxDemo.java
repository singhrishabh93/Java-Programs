// class Box {
//     private double width, height, depth; 
// }
public class BoxDemo{
    private double width, height, depth; 
    public static void main(String[] args) {
        BoxDemo b1;
        b1 = new BoxDemo();
        b1.depth = 20;
        b1.height = 40;
        b1.width = 50;

        double vol;
        vol = b1.width*b1.height*b1.depth;
        System.out.println("Vol of Box " + vol);

    }
}
