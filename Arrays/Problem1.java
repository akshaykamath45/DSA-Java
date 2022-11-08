import java.util.*;
public class Problem1{
    static int MAX = 256;
  
    static boolean canMakeM(String L, String M,String N)
    {
        
        int[] count = new int[MAX];
        char []str1 = L.toCharArray();
        for (int i = 0; i < str1.length; i++)
            count[str1[i]]++;
  
        char []str2 = M.toCharArray();
        for (int i = 0; i < str2.length; i++) {
            count[str2[i]]++;
        }
        
        char []str3 = N.toCharArray();
        for (int i = 0; i < str3.length; i++) {
            if (count[str3[i]] == 0)
                return false;
            count[str3[i]]--;
        }
        return true;
    }
  
    static public void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        String L = s.next();
        String M = s.next();
        String N=s.next();
        if (canMakeM(L,M,N))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}