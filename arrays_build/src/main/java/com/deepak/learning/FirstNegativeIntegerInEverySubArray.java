package com.deepak.learning;
public class FirstNegativeIntegerInEverySubArray {
    public long[] printFirstNegativeInteger(long A[], int N, int K){
        @SuppressWarnings("unused")
        int i=0,j=0,index=0;
        long[] ans=new long[N];
        while(j<N){
            if((j-i+1)<K){
                j++;
            }
            else{
                
            }
        }
        return ans;
    }
}
