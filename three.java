import java.util.*;
class Codechef
{
	public static void main(String[] args) {
        Scanner dev = new Scanner(System.in);

        int t = dev.nextInt();
        for(int i=0; i<t; i++){
            int n = dev.nextInt();
            int m = dev.nextInt();
            if (isPossible(n, m)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        
        dev.close();
    }
    private static boolean isPossible(int n, int m) {
        // If both initially have the same number of problems, it is possible
        if (n == m) {
            return true;
        }
        
        int diff = Math.abs(n-m);
        if(diff%2==0 || diff%4==0){
            return true;
        }

        return false; // Otherwise, it is not possible

    }
}