package Overloading;

import javax.sound.sampled.SourceDataLine;

abstract class rishabh{

    abstract void s();
    void show(){
        System.out.println("Inside Abstract Class");
    }
}
class  singh extends rishabh {
    void s(){
        System.out.println("Inside child class singh");
    }

}

public class AbstractClassDemo{
    public static void main(String[] args) {
        // rishabh s1 = new rishabh();
        singh s1 = new singh();
        s1.s();
        s1.show();
        
    }
}
