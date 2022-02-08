package com.careerdevs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrganizingContainers {

    public static String solution(List<List<Integer>> container){
        // Attempt #1 HashMaps
//        HashMap<Integer, Integer> ballCount = new HashMap<>();
//        HashMap<Integer, Integer> boxCap = new HashMap<>();
//
//        for(int box = 0; box < container.size(); box++){
//            for(int color = 0; color < container.size(); color++){
//                int count = container.get(box).get(color);
//
//                if(ballCount.containsKey(color))
//                    ballCount.put(color, ballCount.get(color) + count);
//                else
//                    ballCount.put(color, count);
//
//                if(boxCap.containsKey(box))
//                    boxCap.put(box, boxCap.get(box) + count);
//                else
//                    boxCap.put(box, count);
//            }
//        }
//
//        for(int color : ballCount.keySet()){
//            boolean validSize = false;
//
//            for(int box : boxCap.keySet()){
//                if(ballCount.get(color) == boxCap.get(box)){
//                    validSize = true;
//                    break;
//                }
//            }
//
//            if(boxCap.size() > 0)
//                return "Impossible";
//        }
//
//        return "Possible";

        // Attempt #2 Arrays.sort
        int[] ballCount = new int[container.size()];
        int[] boxCount = new int[container.size()];

        for(int box = 0; box < container.size(); box++){
            for(int color = 0; color < container.size(); color++){
                int count = container.get(box).get(color);

                ballCount[color] += count;
                boxCount[box] += count;
            }
        }

        Arrays.sort(ballCount);
        Arrays.sort(boxCount);

        for(int i = 0; i < ballCount.length; i++){
            if(ballCount[i] != boxCount[i])
                return "Impossible";
        }

        return "Possible";
    }

    public static void main(String[] args) {
        List<List<Integer>> containers = new ArrayList<>();
        containers.add((List.of(1, 3, 1)));
        containers.add((List.of(2, 1, 2)));
        containers.add((List.of(3, 3, 3)));
        System.out.println(solution(containers));

        containers.clear();
        containers.add((List.of(0, 2, 1)));
        containers.add((List.of(1, 1, 1)));
        containers.add((List.of(2, 0, 0)));
        System.out.println(solution(containers));
    }
}
