package java;

import java.util.HashMap;
import java.util.Map;

public class NonOverlappingSumOfTwoSet {

    static int findSum(int[] A, int[] B, int n) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hash.containsKey(A[i]))
                hash.put(A[i], 1 + hash.get(A[i]));
            else
                hash.put(A[i], 1);
            if (hash.containsKey(B[i]))
                hash.put(B[i], 1 + hash.get(B[i]));
            else
                hash.put(B[i], 1);
        }
        int sum = 0;
        for (Map.Entry entry : hash.entrySet()) {
            if (Integer.parseInt((entry.getValue()).toString()) == 1)
                sum += Integer.parseInt((entry.getKey()).toString());
        }
        return sum;
    }

    public static void main(String args[]) {
        int[] A = {5, 4, 9, 2, 3};
        int[] B = {2, 8, 7, 6, 3};
        int n = A.length;
        System.out.println(findSum(A, B, n));
    }
}
