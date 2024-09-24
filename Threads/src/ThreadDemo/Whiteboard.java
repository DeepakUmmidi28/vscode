package ThreadDemo;

public class Whiteboard {
    String text;
    int noOfStudents=0;
    int count=0;
    public synchronized void write(String str){
        while(count!=0){
            try{wait();Thread.sleep(1000);}catch(Exception e){}
        }
        this.text=str;
        count=noOfStudents;
        notifyAll();
    }
    public synchronized String read(){
        while(count==0){
            try{wait();Thread.sleep(1000);}catch(Exception e){}
        }
        count--;
        if(count==0) notify();
        return text;
    }   
    public synchronized void attendance(){
        noOfStudents++;
        // try{Thread.sleep(100);}catch(Exception e){}
    }
}

class Teacher extends Thread{
    Whiteboard w;
    String arr[]={"Java","Python","DBMS","HTML","CSS","JavaScript"};
    Teacher(Whiteboard w){
        this.w=w;
    }
    public void run(){
        for(String s:arr){
            w.write(s);
            System.out.println("Teacher is writing "+s);
            System.out.flush();
        }
    }
}

class Student extends Thread{
    Whiteboard w;
    String name;
    Student(Whiteboard w,String name){
        this.w=w;
        this.name=name;
        w.attendance();
    }
    public void run(){
        for(int i=0;i<6;i++){
            String s=w.read();
            System.out.println(name+" is reading "+s);
            System.out.flush();
        }
    }
}

class Driver{
    public static void main(String[] args) {
        Whiteboard w=new Whiteboard();
        Teacher t=new Teacher(w);
        Student s1=new Student(w, "Deepak");
        Student s2=new Student(w, "Hemanth");
        Student s3=new Student(w, "Ramya");
        s1.start();
        s2.start();
        s3.start();
        t.start();
    }
}


