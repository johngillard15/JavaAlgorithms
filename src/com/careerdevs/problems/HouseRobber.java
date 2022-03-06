package com.careerdevs.problems;

import java.util.ArrayList;
import java.util.List;

public class HouseRobber {

    public static int solution(int[] nums) {
        List<Integer> houses = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(houses.indexOf(i) && nums[i] > nums[bestHouse])
                bestHouse = i;
        }

        int money = 0;

        return bestHouse;
    }
}
