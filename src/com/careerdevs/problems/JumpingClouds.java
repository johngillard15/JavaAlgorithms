package com.careerdevs.problems;

import java.util.List;

public class JumpingClouds {

    public static int jumpingOnClouds(List<Integer> c) {
        int jumps = 0;

        for(int i = 0; i != c.size() - 1; i++, jumps++){
            if(i + 2 <= c.size() - 1 && c.get(i + 2) == 0)
                i++;
        }

        return jumps;
    }

    public static void main(String[] args) {

    }
}
