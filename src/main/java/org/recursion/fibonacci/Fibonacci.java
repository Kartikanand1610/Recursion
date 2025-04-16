package org.recursion.fibonacci;

public class Fibonacci {
    public int  getFibo(int n){
        if(n<=1){
            return n;
        }
        //by using multiple recursion calls we want for any n element we need f(n-1)+f(n-2)
        int last=getFibo(n-1);
        int slast=getFibo(n-2);
        return last+slast;
    }
}
