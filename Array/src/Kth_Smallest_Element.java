import java.util.Arrays;

public class Kth_Smallest_Element {
    public static void main(String[] args) {
        int arr[]={23, 10, 3, 4, 49, 32};
        int k=3;
        System.out.println(KthSmallest(arr,k));
    }
    private static int KthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k-1];
    }
}
