package Overloading; 

// public class OverloadDemo {
//     void show(){
//         System.out.println("Without parameter");
//     }
//     void show(String str){
//         System.out.println("With String parameter" + str);
//     }

//     public static void main(String[] args) {
//         OverloadDemo o = new OverloadDemo();
//         o.show();
//         o.show("Hemant");
//     }
// }   

public class OverloadDemo {
    String show(int a){
        // 
        return "Without parameter";
    }
    String show(String str){
        // System.out.println("With String parameter" + str);
        return "With String parameter" + str;
    }

    public static void main(String[] args) {
        OverloadDemo o = new OverloadDemo();
        String st = o.show(12);
        
        String str1 = o.show("hemant");
        System.out.println(" "+st);
        System.out.println(" " + str1);
    }
}