public class Test {
    int a,b;
    static int c=10;
    public static void meth1(){
        System.out.println("inside meth1");
    }
    public static void main(String[] args) {
        Test.meth1();
        System.out.println(Test.c);
    }
}