package com.deepak.learning;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Output_Stream_Writer {
    public static void main(String[] args) {
        try(OutputStreamWriter osw=new OutputStreamWriter(System.out)){
            osw.write("hello");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
