//Mandatory to be Sorted Array
//Time Complexity-O(log n)
public class BinarySearch {
    public static int binarySearch(int arr[], int N, int K) {
        int start = 0;
        int end = N - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == K)// element found
            {
                return mid;
            }
            if (arr[mid] < K)//right
            {
                start = mid + 1;
 
            } else// if(arr[mid]>K)//left
            {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int K = 10;
        int N = 8;
        System.out.println("Index for key is : " + binarySearch(arr, N, K));

    }
}
