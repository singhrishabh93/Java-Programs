package Overloading;

class Area{
    int x = 10;
    int y = 20;
    double area (double r){
        return 3.14 *r *r ;
    }
}

class Square extends Area{
    int x =100;
    double area( double s){
        System.out.println("Var x in parent class =" + super.x);
        System.out.println("Var x in parent class =" + super.area(2.1));
        return s*s;
    }

}

public class OverridingDemo {
    public static void main(String[] args) {
        // Area a = new Area();
        Square s = new Square();
        // double area_of_circle = a.area(3.2);
        double area_of_circle = s.area(3.2);
        System.out.println("Area " + area_of_circle);
        System.out.println("Var X = " + s.x);
        System.out.println("Var Y = " + s.y);
    }
}
