package Kata;

import java.util.*;

public class FindOdd {

    public static int findIt(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i: a) {
            if (!map.containsKey(i)) map.put(i, 1);
            else map.put(i, map.get(i) + 1);
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet())
            if (e.getValue() % 2 == 1) return e.getKey();
        return 0;
    }

    // or
    public static int findItt(int[] a) {
        int res = 0;
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            res ^= a[i];
            System.out.println(res);
        }
        return res;
    }
}
