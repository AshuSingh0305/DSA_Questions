//Java program to Move all negative numbers to beginning and positive to end

import java.util.Arrays;

public class Negative_Element_to_One_Side {
    public static void main(String[] args) {
        int arr[]={-12, 11, -13, -5, 6, 7, 5, -3, -6};
        function(arr);
    }
    public static void function(int arr[]){
        int j=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]<0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
