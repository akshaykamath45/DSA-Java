import java.util.*;

public class PerfectSquare {
    public static boolean isPerfectSquare(int x) {
        if (x >= 0) {
            int y = (int) Math.sqrt(x);
            return ((y * y) == x);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an number to check if it is a perfect square or not ");
        int x = s.nextInt();
        if (isPerfectSquare(x))
            System.out.print("Yes");
        else
            System.out.print("No");
    }

}
