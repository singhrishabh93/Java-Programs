package Overloading;

interface A{
    int x =10;
    void show1();
}
interface B extends A{
    void show2();
    void show3();
}

interface C extends A, B {
    void show4();
}

public class InterfaceDemo implements B {
    
    public void show1(){
        System.out.println("From show1()");
    }
    public void show2(){
        System.out.println("From show2()");
    }
    public void show3(){
        System.out.println("From show3()");
    }
    public void show4(){
        System.out.println("From show4()");
    }
    public static void main(String[] args) {

        B a;
        InterfaceDemo i1 = new InterfaceDemo();
        i1.show1();
        i1.show2();
        i1.show3();
        // a = i1;
        // a.show1();
        i1.show4();
    }
}
