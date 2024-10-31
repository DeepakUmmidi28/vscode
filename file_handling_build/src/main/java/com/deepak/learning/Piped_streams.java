package com.deepak.learning;
// import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Piped_streams {
    public static void main(String[] args) throws Exception{
        PipedInputStream pis=new PipedInputStream();
        PipedOutputStream pos=new PipedOutputStream();
        producer p=new producer(pos);
        consumer c=new consumer(pis);
        pis.connect(pos);
        p.start();
        c.start();
    }
}

class producer extends Thread{
    OutputStream os;
    producer(OutputStream s){
        os=s;
    }
    synchronized public void run() {
        int count=0;
        while(true){
            try {
                os.write(count);
                System.out.println("Producer "+count);
                os.flush();
                System.out.flush();
                Thread.sleep(10);
                count++;
            } catch (Exception e) {            }
        }
    }
}

class consumer extends Thread{
    InputStream is;
    consumer(InputStream s){
        is=s;
    }
    synchronized public void run() {
        int x;
        try {
            while(true){
                x=is.read();
                System.out.println("Consumer "+x);
                System.out.flush();
                Thread.sleep(10);
            }
        } catch (Exception e) {        }
    }
}
