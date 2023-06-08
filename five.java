import java.util.*;

public class five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int N = scanner.nextInt();
            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }

            int count = countPalindromePairs(A);
            System.out.println(count);
        }

        scanner.close();
    }

    private static int countPalindromePairs(int[] A) {
        int count = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : A) {
            int xor = num;
            int palindromeXor = 0;

            while (xor > 0) {
                palindromeXor ^= (xor % 10);
                xor /= 10;

                if (palindromeXor <= 9) {
                    freqMap.put(palindromeXor, freqMap.getOrDefault(palindromeXor, 0) + 1);
                }
            }
        }

        for (int num : A) {
            int xor = num;
            int palindromeXor = 0;

            while (xor > 0) {
                palindromeXor ^= (xor % 10);
                xor /= 10;

                if (palindromeXor <= 9) {
                    int complement = 9 - palindromeXor;
                    count += freqMap.getOrDefault(complement, 0);
                }
            }
        }

        return count;
    }
}
