package Recursion;

public class powXtoN_Optimaized {
    public static void main(String[] args) {
        int a=2,n=5;
        System.out.println("2 to he power 5 is :"+OP(a,n));

    }
    public static int OP(int a,int n){
        if(n==0){
            return 1;
        }
        int halfPower=OP(a,n/2);
        int halfPowersq=halfPower*halfPower;
        if(n%2!=0){
            halfPowersq=a*halfPowersq;
        }
        return halfPowersq;
    }
}
