package com.careerdevs;

import java.util.HashMap;
import java.util.Map;

public class SherlockAndAnagrams {

    public static int solution(String s){
        int pairs = 0;
        HashMap<Character, Integer> letterCount = new HashMap<>();

        for(Character letter : s.toCharArray()){
            if(letterCount.containsKey(letter))
                letterCount.put(letter, letterCount.get(letter) + 1);
            else
                letterCount.put(letter, 1);
        }

        for(Map.Entry<Character, Integer> letter : letterCount.entrySet()){
        }

        return pairs;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
