package com.careerdevs.problems;

import java.util.List;

public class AppleAndOrange {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int appleCount = 0, orangeCount = 0;

        for (int apple : apples) {
            int landing = a + apple;
            if (s <= landing && landing <= t)
                appleCount++;
        }
        for (int orange : oranges) {
            int landing = b + orange;
            if (s <= landing && landing <= t)
                orangeCount++;
        }

        System.out.println(appleCount);
        System.out.println(orangeCount);
    }

    public static void main(String[] args) {
        
    }
}
