package ReverseEcho;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception{
        Socket skt=new Socket("localhost",2000);

        //BufferedReader keyb=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);

        //Input stream for Server socket
        BufferedReader br=new BufferedReader(new InputStreamReader(skt.getInputStream()));
        //Output stream for Server socket
        PrintStream ps=new PrintStream(skt.getOutputStream());

        String msg;
        do{
            // msg=keyb.readLine();
            msg=sc.nextLine();
            ps.println(msg);
            System.out.println(msg+" sent to server");
            msg=br.readLine();
            System.out.println("From Server : "+msg);
        }while(!msg.equals("dne"));
        ps.println("Connection terminated");
        skt.close();
        sc.close();
    }
}
