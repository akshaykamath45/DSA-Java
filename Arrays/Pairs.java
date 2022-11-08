// tp=n(n-1)/2,tp=Total Pairs
// Time Complexity=O(n2)
public class Pairs{
    public static int pairArrays(int arr[]) {
        int tp=0;
        for(int i=0;i<arr.length;i++)
        {
            int current=arr[i];//2,4,6,8,10
           
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.print("("+current+","+arr[j]+" )");
                tp++;
            }
            System.out.println();
        } 
        System.out.println("Total Pairs= "+tp);
        return 1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8,10};
        pairArrays(arr);
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.println(arr[i]);
        // }

    }
}
