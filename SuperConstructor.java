package Overloading;

class x{
    double a,b,c;
    x(double d, double e, double f){
        a=d;
        b=e;
        c=f;
        System.out.println("Inside Super Class");
    }
}

class y extends x{
    double aa;
    y(double dd, double ee, double ff, double gg){
        super(dd, ee, ff);
        aa =gg;
        System.out.println("Inside Child Class");
    }
}

public class SuperConstructor {
    public static void main(String[] args) {
        y y1 = new y(1.2, 3.1, 1.7, 8.0);
        System.out.println("a = " +y1.a);
        System.out.println("b = " +y1.b);
        System.out.println("c = " +y1.c);
        System.out.println("aa = " +y1.aa);
    }
}
