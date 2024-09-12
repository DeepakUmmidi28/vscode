package Recursions;
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(FiboSearch(6));
    }

    static int FiboSearch(int n){
        if(n<2) return n;
        return FiboSearch(n-1) + FiboSearch(n-2);
    }
}
