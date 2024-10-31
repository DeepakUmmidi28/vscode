package com.deepak.learning;
import java.util.Scanner;

public class Max2D {
    // int rows;
    // int coloumns;
    // int arr[][];
    // public Question01(int rows,int coloumns,int arr[][])
    // {
    //     this.coloumns=coloumns;
    //     this.rows=rows;
    //     this.arr=arr;
    // }
    public static int[][] CollectInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows--->");
        int rows=sc.nextInt();
        System.out.println("Enter no of Coloumns--->");
        int coloumns=sc.nextInt();
        int arr[][]=new int[rows][coloumns];
        System.out.println("Enter your Input---->");
        for(int i=0;i<rows;i++){
            for(int j=0;j<coloumns;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();
        return arr;
    }

    public static void GetMaximum(int arr[][]){
        for(int i=0;i<arr.length;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<arr[i].length;j++){
                max=Math.max(max,arr[i][j]);
            }
            System.out.println("Maximum of "+(i+1)+"th row : "+max);
        }
    }

    public static void main(String[] args) {
        int arr[][]=Max2D.CollectInput();
        Max2D.GetMaximum(arr);
    }
}
