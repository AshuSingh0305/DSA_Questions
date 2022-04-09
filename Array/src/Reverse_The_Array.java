//Java Program to Reverse an Array

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_The_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter Elements of Array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr, n);
    }
    public static void reverse(int arr[], int n){
        int temp,start=0,end=n-1;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;end--;
        }
        System.out.print("\nReversed Array: "+ Arrays.toString(arr));
    }
}
