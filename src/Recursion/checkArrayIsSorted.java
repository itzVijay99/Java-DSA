package Recursion;

import java.util.Arrays;

public class checkArrayIsSorted {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        System.out.println("Is this array sorted");
        System.out.println(isCheck(arr,0));
    }
    public static boolean isCheck(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isCheck(arr,i+1);
    }
}
