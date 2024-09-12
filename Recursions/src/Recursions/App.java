package Recursions;
public class App {
    public static void main(String[] args) throws Exception {
        Solution s=new Solution();
        s.a=10;
        s.b=20;
        s.add();
        Solution s1=new Solution();
        s1.a=20;
        s1.b=20;
        s1.add();
        System.out.println(s.result);
        System.out.println(s1.result);
    }
}

class Solution {
    int a,b,result;
    void add(){
        result = a + b;
    }
}
