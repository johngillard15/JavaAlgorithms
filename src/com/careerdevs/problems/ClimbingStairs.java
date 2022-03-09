package com.careerdevs.problems;

public class ClimbingStairs {

    public static int solution(int n) {
        int a = 1, b = 1;

        while(n-- > 0){
            int bOld = b;
            b += a;
            a = bOld;
        }

        return a;
    }
}
