package com.careerdevs;

public class JumpingCloudsRevisited {

    public static int solution(int[] c, int k){
        int energy = 100;

        int i = 0;
        do{
            if(c[i] == 1)
                energy -= 3;
            else
                energy--;

            i = (i + k) % c.length;
        } while(i != 0);

        return energy;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{0, 0, 1, 0, 0, 1, 1, 0}, 2));
    }
}
