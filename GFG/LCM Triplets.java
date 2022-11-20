class Solution {
    long lcmTriplets(long N) {
        
        if(N<=2)//Cannot be zero
        {
            return N;   
        }
        
        if((N&1)==1)//Checking for Odd Condition Directly
        {
        return N*(N-1)*(N-2);
        }
        if(N%3==0)
        {
              return (N-1)*(N-2)*(N-3);
        }
        return N*(N-1)*(N-3);//Even 
    }
}
