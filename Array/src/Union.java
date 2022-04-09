//Java code to find the Union of Array

import java.util.Arrays;

public class Union {
    static int index=0;
    static int j=0;         //index for arr2
    static int i=0;         //index for arr
    public static void main(String[] args) {
        int arr[] = {8,4,4,10,5,9};
        int arr2[]= {5,4,3,7,9,11,12};
        Arrays.sort(arr);
        Arrays.sort(arr2);
        int newarr[]=new int[arr.length+arr2.length];
        union(arr, arr2, i, j, index, newarr);
    }
    private static void union(int arr[], int arr2[], int i, int j, int index, int newarr[]){
        if((i!= arr.length && j!= arr2.length)){
            if(arr[i]>arr2[j]){
                newarr[index++]=arr2[j++];
                while (j<arr.length-1&&arr[j]==arr[j-1]){
                    j++;
                }
            }else if(arr[i]<arr2[j]){
                newarr[index++]=arr[i++];
                while (i<arr.length-1&&arr[i]==arr[i-1]){
                    i++;
                }
            }else if(arr[i]==arr2[j]){
                newarr[index++]=arr[i++];
                j++;
                while (i<arr.length-1&&arr[i]==arr[i-1]){
                    i++;
                }
                while (j<arr.length-1&&arr[j]==arr[j-1]){
                    j++;
                }
            }
            union(arr, arr2, i, j, index, newarr);
        }else{
            if(i==arr.length){
                while(j!=arr2.length){
                    newarr[index++]=arr2[j++];
                }
            }else if(j==arr2.length){
                while (i!=arr.length){
                    newarr[index++]=arr[i++];
                }
            }
            for(int a=0;a<index;a++){
                System.out.print(newarr[a]+" ");
            }
            return;
        }
    }
}
