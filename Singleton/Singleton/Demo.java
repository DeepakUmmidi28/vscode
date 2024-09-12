package Singleton;
public class Demo {
    
    private static volatile Demo demoinst ;
    private Demo()
    {System.out.println("Instance created");}
    static Demo getInstance()
    {
        if(demoinst == null)
        {
        synchronized(Demo.class)
            {
                if(demoinst == null)
                demoinst =new Demo();
            }
        }
       return demoinst;
    }

}

// public static void main(String[] args) {
//     Demo d1=Demo.getInstance();
//     Demo d2=Demo.getInstance();
//     System.out.println(d1+" "+d2);
// }