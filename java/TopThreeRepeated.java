package java;


import java.util.Map;
import java.util.TreeMap;

public class TopThreeRepeated {

    class Pair {
        int first, second;
    }

    static void top3Repeated(int[] arr, int n) {
        if (n < 3) {
            System.out.print("Invalid Input");
            return;
        }
        TreeMap<Integer, Integer> freq = new TreeMap<>();
        for (int i = 0; i < n; i++)
            if (freq.containsKey(arr[i]))
                freq.put(arr[i], 1 + freq.get(arr[i]));
            else
                freq.put(arr[i], 1);
        Pair x = new Pair();
        Pair y = new Pair();
        Pair z = new Pair();
        x.first = y.first = z.first = Integer.MIN_VALUE;
        for (Map.Entry curr : freq.entrySet()) {
            if (Integer.parseInt(String.valueOf(curr.getValue())) > x.first) {
                z.first = y.first;
                z.second = y.second;
                y.first = x.first;
                y.second = x.second;
                x.first = Integer.parseInt(String.valueOf(curr.getValue()));
                x.second = Integer.parseInt(String.valueOf(curr.getKey()));
            } else if (Integer.parseInt(String.valueOf(curr.getValue())) > y.first) {
                z.first = y.first;
                z.second = y.second;
                y.first = Integer.parseInt(String.valueOf(curr.getValue()));
                y.second = Integer.parseInt(String.valueOf(curr.getKey()));
            } else if (Integer.parseInt(String.valueOf(curr.getValue())) > z.first) {
                z.first = Integer.parseInt(String.valueOf(curr.getValue()));
                z.second = Integer.parseInt(String.valueOf(curr.getKey()));
            }
        }
        System.out.print("Three largest elements are " + x.second + " "
                + y.second + " " + z.second);
    }

    public static void main(String args[]) {
        int[] arr = {3, 4, 2, 3, 16, 3, 15,
                16, 15, 15, 16, 2, 3};
        int n = arr.length;
        top3Repeated(arr, n);
    }
}
