package org.recursion.fibonacci;

public class Main {
    public static void main(String[] args ){
        int n=4;
        //calling the fibonacci function by making object of fibonacci class.
        Fibonacci fibonacci=new Fibonacci();
        int result=fibonacci.getFibo(n);
        System.out.println(result);

    }
}
