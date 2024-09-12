package Singleton;
public class Driver {
    public static void main(String[] args) {
        Demo d1=Demo.getInstance();
        Demo d2=Demo.getInstance();
        System.out.println(d1+" "+d2);
    }
}
