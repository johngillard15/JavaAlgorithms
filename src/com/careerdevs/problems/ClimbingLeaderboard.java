package com.careerdevs.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClimbingLeaderboard {

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Attempt 1 - exponential complexity, 6/10 cases
//        List<Integer> podium = new ArrayList<>();
//
//        for(int score : player){
//            int rank = 1;
//
//            int lastHighscore = -1;
//            for(int highscore : ranked){
//                if(score < highscore && highscore != lastHighscore)
//                    rank++;
//                else if(score > highscore || score == highscore)
//                    break;
//
//                lastHighscore = highscore;
//            }
//
//            podium.add(rank);
//        }
//
//        return podium;

        // Attempt 2 - distinct ranked list 8/10
        List<Integer> podium = new ArrayList<>();
        ranked = ranked.stream().distinct().collect(Collectors.toList());

        int i = ranked.size() - 1;
        for(int score : player){
            do{
                if(score < ranked.get(i)) {
                    podium.add(i + 2);
                    break;
                }
            } while(--i >= 0);

            if(i < 0)
                podium.add(1);
        }

        return podium;
    }

    public static void main(String[] args) {

    }
}
