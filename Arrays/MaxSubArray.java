
public class MaxSubArray {
    public static int pairArrays(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i]=prefix[i]+arr[i];
        }// total subarrays
        for (int i = 0; i < arr.length; i++) {
            int start = i;// 2,4,6,8,10
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = 0;
                // for (int k = start; k <= end; k++) { // subarray sum
                //     currSum += arr[k];
                // }
                currSum=start==0 ? prefix[end]:prefix[end]-prefix[start-1];
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
         
            }
          
        }
        System.out.println("Max Sum =" + maxSum);

        return 1;
    }
    public static void kadanes(int nums[]){

        int ms=Integer.MIN_VALUE;
        int cs=0;
     
        for(int i=0;i<nums.length;i++)
        {
            cs=cs+nums[i];
            
            if(cs<0)//cs<nums[i]
            {
                cs=0;//cs=nums[i]
            }
   
   
            ms=Math.max(cs,ms);
            
        }
        System.out.println(ms);
    }

    public static void main(String[] args) {
        // int arr[] = {-2,-3,4,-1,-2,1,5,-3 };
        int arr[] = {-1,-2,-3};
        //pairArrays(arr);
        kadanes(arr);
        // for(int i=0;i<arr.length;i++)
        // {
        // System.out.println(arr[i]);
        // }

    }
}
