package OOPS;
public class EncapsulationDemo {
    private int x;
    private String name;
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}

class driver{
    public static void main(String[] args) {
        EncapsulationDemo obj=new EncapsulationDemo();
        obj.setName("Deepak");
        String name=obj.getName();
        System.out.println(name);
        
    }
}
