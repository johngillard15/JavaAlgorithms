package com.careerdevs.problems;

public class ClimbingStairs {

    public static int solution(int n) {
        int a = 1, b = 1;

        for (int i = 0; i < n; i++) {
            a = b + (b = a);
        }

        return b;
    }
}
