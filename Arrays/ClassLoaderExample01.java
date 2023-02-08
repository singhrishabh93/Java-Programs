


public class ClassLoaderExample01{
    public static void main(String[] args){
        Class c = ClassLoaderExample01.class;
        System.out.println(c.getClassLoader());
    }
}
