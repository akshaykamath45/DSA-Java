// tp=n(n-1)/2,tp=Total Pairs
// Time Complexity=O(n2)
public class SubArray{
    public static int pairArrays(int arr[]) {
        int ts=0;//total subarrays
        for(int i=0;i<arr.length;i++)
        {
            int start=i;//2,4,6,8,10
            for(int j=i;j<arr.length;j++)
            {
                int end=j;
                for(int k=start;k<=end;k++)
                {   //print
                    System.out.print(arr[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        } 
        System.out.println("Total Subaarays ="+ts);
        
        return 1;
    }

    public static void main(String[] args) {
        int arr[] ={2,4,6,8,10};
        pairArrays(arr);
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.println(arr[i]);
        // }

    }
}
