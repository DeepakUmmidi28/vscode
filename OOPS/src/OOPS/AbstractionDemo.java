package OOPS;
public class AbstractionDemo extends Demo{
    @Override
    void meth1() {
        System.out.println("Inside meth1");
    }
    @Override
    void meth2() {
        System.out.println("Inside meth2");
    }
}

abstract class Demo{
    abstract void meth1();
    abstract void meth2();
    public static final int x = 0;
}

interface Demo02{
    abstract void meth3();
    void meth4();
    int x=10,y=20,z=30;
}
