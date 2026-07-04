package Recursion;

public class FirstOccurence_And_LastOccurence {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,5};
        int key=3;
        System.out.println("First occurence of 3 is :"+FO(arr,key,0));
        System.out.println("Last occurence of 3 is :"+LO(arr,key,0));
    }
    public static int FO(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return FO(arr,key,i+1);
    }
    public static int LO(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=LO(arr,key,i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;

    }
}
