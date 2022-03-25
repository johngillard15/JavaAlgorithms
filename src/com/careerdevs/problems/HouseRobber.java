package com.careerdevs.problems;

public class HouseRobber {

    public static int solution(int[] nums) {
        switch(nums.length){
            case 0:
                return 0;
            case 1:
                return nums[0];
            case 2:
                return Math.max(nums[0], nums[1]);
            case 3:
                return Math.max(nums[0] + nums[2], nums[1]);
            default:
                break;
        }

        int maxHaul = 0;
        int lastHaul = nums[0];
        int lastHaul2 = 0;
        for(int i = 1; i < nums.length; i++){
            maxHaul = Math.max(lastHaul2 + nums[i], lastHaul);
            lastHaul2 = lastHaul;
            lastHaul = maxHaul;
        }

        return maxHaul;
    }


}
