package ThreadDemo;

public class Main {
    public static void main(String[] args) {
        Stack s=new Stack(5);
        new Thread(()->{
            for(int i=0;i<10;i++){
                try {
                    System.out.println("Pushed :"+s.push(i));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"Pusher").start();

        new Thread(()->{
            for(int i=0;i<10;i++){
                try {
                    System.out.println("Popped :"+s.pop());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "Popper").start();
    }
}
