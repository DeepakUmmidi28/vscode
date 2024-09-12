package WrapperClass;
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer b=new StringBuffer("Java");
        b.append("python");
       int i= b.indexOf("Hello ", 10);
       b.insert(2,10);
       b.delete(2, 4);
        System.out.println(b+ " "+i);
    }
}
