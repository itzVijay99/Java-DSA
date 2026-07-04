package Recursion;

public class nthFibonacci {
    public static void main(String[] args) {
        int n=5;
        int k=4;
        System.out.println(fib(n));
        System.out.println(fib(4));
    }
    public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        int fnm1=fib(n-1);
        int fnm2=fib(n-2);
        return fnm1+fnm2;
    }
}
