import Kata.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long t = System.currentTimeMillis();
        System.out.println(CuboidVolumes.findDifference(new int[]{10, 12, 10}, new int[]{123, 3, 34}));
        System.out.println(System.currentTimeMillis() - t);
    }
}
