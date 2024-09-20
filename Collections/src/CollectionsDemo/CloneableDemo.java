package CollectionsDemo;

public class CloneableDemo implements Cloneable{
    int age;
    String name;
    int arr[];
    public CloneableDemo(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr=new int[]{1,2,3,4,5};
    }
    public CloneableDemo(CloneableDemo c) {
        this.age=c.age;
        this.name=c.name;
    }

    public Object clone() throws CloneNotSupportedException{
        //shallow copy
        //return super.clone(); 

        //Deep Copy
        CloneableDemo d=(CloneableDemo)super.clone();
        d.arr=new int[d.arr.length];
        for(int i=0;i<d.arr.length;i++){
            d.arr[i]=this.arr[i];
        }
        return d;
    }
    public static void main(String[] args) throws CloneNotSupportedException{
        CloneableDemo i=new CloneableDemo(21, "Deepak");
        // CloneableDemo j=new CloneableDemo(21, "Deepak");

        CloneableDemo j=(CloneableDemo)i.clone();

        // CloneableDemo k=new CloneableDemo(j);
        // System.out.println(k.age+" "+k.name);

        j.name="Hemanth";
        System.out.println(i.name);
        System.out.println(j.name);
    }
    
}
