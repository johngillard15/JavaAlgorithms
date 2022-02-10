package com.careerdevs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {

    public static int solution(List<Integer> arr){
//        HashMap<Integer, Integer> birds = new HashMap<>();
//
//        int topBird = arr.get(0);
//
//        for(int i = 0; i < arr.size(); i++){
//            if(birds.get(arr.get(i)) == null){
//                birds.put(arr.get(i), 1);
//            }
//
//            birds.put(arr.get(i), birds.get(arr.get(i)) + 1);
//
//        }
//
//        for(int type: birds.keySet()){
//
//            if(birds.get(type) > birds.get(topBird)){
//                topBird = type;
//            }
//            else if(birds.get(type) == birds.get(topBird)){
//
//                if(type < topBird) topBird = type;
//            }
//        }
//
//        return topBird;

        HashMap<Integer, Integer> birdCount = new HashMap<>();

        for(int type : arr){
            if(birdCount.containsKey(type))
                birdCount.put(type, birdCount.get(type) + 1);
            else
                birdCount.put(type, 1);
        }

        int topBird = arr.get(0);

        for(Map.Entry<Integer, Integer> bird : birdCount.entrySet()){
            if(bird.getValue() > birdCount.get(topBird)
                    || (bird.getValue() == birdCount.get(topBird)
                        && bird.getKey() < topBird)
            )
                topBird = bird.getKey();
        }

        return topBird;
    }

    public static void main(String[] args) {
        System.out.println(solution(List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)));
    }
}
