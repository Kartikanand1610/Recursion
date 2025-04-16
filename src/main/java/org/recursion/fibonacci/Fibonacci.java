package org.recursion.fibonacci;

public class Fibonacci {
    public int  getFibo(int n){
        if(n<=1){
            return n;
        }
        int last=getFibo(n-1);
        int slast=getFibo(n-2);
        return last+slast;
    }
}
