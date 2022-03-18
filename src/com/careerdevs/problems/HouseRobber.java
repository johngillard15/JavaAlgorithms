package com.careerdevs.problems;

import java.util.ArrayList;
import java.util.List;

public class HouseRobber {

    public static int solution(int[] nums) {
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];
        // if(nums.length == 2)
        //     return Math.max(nums[0], nums[1]);

        int lastHouse = nums[0];
        int lastHouse2 = 0;
        for(int i = 1; i < nums.length; i++){
            int thisHouse = Math.max(lastHouse2 + nums[i], lastHouse);
            lastHouse2 = lastHouse;
            lastHouse = thisHouse;
        }

        return lastHouse;
    }
}
