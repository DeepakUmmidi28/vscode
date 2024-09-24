package ThreadDemo;

public class ATM {
    public synchronized void checkBalance(String name){
        System.out.println(name+" is checking balance");
    }

    public synchronized void withdraw(String name,int amount){
        System.out.println(name+" is withdrawing "+amount);
    }
}

class Customer extends Thread{
    ATM a;
    String name;
    int amount;
    Customer(ATM a,String name,int amount){
        this.a=a;
        this.amount=amount;
        this.name=name;
    }
    void useATM(){
        a.checkBalance(name);
        a.withdraw(name, amount);
    }
    public void run(){
        useATM();
        try{Thread.sleep(100);}catch(Exception e){}
    }
}

// class Driver{
//     public static void main(String[] args) {
//         ATM a=new ATM();
//         Customer c1=new Customer(a, "Deepak", 100);
//         Customer c2=new Customer(a, "Hemanth", 200);
//         Customer c3=new Customer(a, "Sai", 300);
//         c1.start();
//         c2.start();
//         c3.start();
//     }
// }
