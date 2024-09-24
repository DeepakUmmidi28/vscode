package ReverseEcho;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class reverseEcho {
    public static void main(String[] args) throws Exception{
        @SuppressWarnings("resource")
        ServerSocket ss=new ServerSocket(2000);
        Socket skt=ss.accept();
        System.out.println("Connection established");
        //Input stream for  client Socket
        BufferedReader br=new BufferedReader(new InputStreamReader(skt.getInputStream()));
        //Output stream for  client Socket
        PrintStream ps=new PrintStream(skt.getOutputStream());

        String msg;
        StringBuffer sb;
        do{
            msg=br.readLine();

            sb=new StringBuffer(msg);
            msg=sb.reverse().toString();

            ps.println(msg);
        }while(!msg.equals("dne"));

        //for receiving termination message
        msg=br.readLine();
        System.out.println(msg);
        
        skt.close();
    }
}


