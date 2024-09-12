package WrapperClass;
public class Demo
{
    public static void main(String[] args) {
        int i=10;
        //Integer a=Integer.valueOf(i);     //Boxing 
        Integer a=i;                        //auto-Boxing    
        System.out.println(a);                
        Float f=10.22f;                         
        float b=f.floatValue();             //Un-Boxing 
        float c=f;                          //Auto-Un-Boxing    
        System.out.println(c);
    }
}