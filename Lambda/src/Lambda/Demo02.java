package Lambda;
public class Demo02 {
    public static void main(String[] args) {
        Test t=(var)->
        {
            System.out.println(var-1);
        };
        t.fun(10);

    }
}

@FunctionalInterface
abstract interface Test
{
    public void fun(int x);
}

