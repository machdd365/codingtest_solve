package org.example;

public class Minimumsqure {
    public static int solution(int[][] sizes) {
        int minSide = 0, maxSide = 0;
        for (int[] size : sizes) {
            int min = Math.min(size[0], size[1]);
            int max = Math.max(size[0], size[1]);
            maxSide = Math.max(max, maxSide);
            minSide = Math.max(min, minSide);
        }
        return maxSide * minSide;
    }
}
