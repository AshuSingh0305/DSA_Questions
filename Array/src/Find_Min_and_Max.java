//Java program to find Minimum and Maximum of elements of Array

public class Find_Min_and_Max {
    public static void main(String[] args) {
        int arr[]={10, 22, 54, 3, 28};
        Min_Max(arr);
    }
    public static void Min_Max(int []arr){
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum: "+min+"\nMaximum: "+max);
    }
}
