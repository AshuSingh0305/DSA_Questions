// Sort Array of 0s, 1s, and 2s without using any sorting algorithm

import java.util.Arrays;

public class Sort_Array_of_0_1_2 {
    public static void main(String[] args) {
        int arr[]={1, 2, 0, 2, 1};
        sort(arr);
    }
    public static void sort(int [] arr){
        int z=0;
        int o=0;
        int t=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                o++;
            }else if(arr[i]==0){
                z++;
            }else{
                t++;
            }
        }
        int i=0;
        while(z!=0){
            arr[i++]=0;
            z--;
        }
        while(o!=0){
            arr[i++]=1;
            o--;
        }
        while(t!=0){
            arr[i++]=2;
            t--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
