import java.util.*;
public class two {
    public static void main(String[] args) {
        Scanner dev = new Scanner(System.in);

        int t = dev.nextInt();
        for(int i=0; i<t; i++){
            int n = dev.nextInt();
            int x = dev.nextInt();
            int mul = n*x;
            String number = String.valueOf(mul);
            if(number.length()==5){
                System.out.println("YES");
            }
            else
            System.out.println("NO");
        }

        dev.close();
    }
}
