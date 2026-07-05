package Recursion_Part2;

public class Tiling {
    public static void main(String[] args) {

        int n=4;
        System.out.println(tile(n));
    }
    public static int tile(int n){
        if(n==1|| n==0){
            return 1;
        }
        return tile(n-1)+tile(n-2);

    }
}
