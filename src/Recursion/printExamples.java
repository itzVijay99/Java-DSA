package Recursion;

public class printExamples {
    public static void main(String[] args) {

        int n=10;
        System.out.println("Printing 1 t0 10 in:");
        System.out.println("Increasing order");
        printInc(n);

        System.out.println("Decreasing order");
        printDec(n);

    }
    public static void printInc(int n){
        if(n==0){
            return;
        }
        printInc(n-1);
        System.out.println(n);



    }
    public static void printDec(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        printDec(n-1);

    }

}
