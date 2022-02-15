package com.careerdevs;

import java.util.HashMap;
import java.util.Map;

public class SherlockAndAnagrams {

    public static int solution(String s){
        int pairs = 0;

        for(int i = 0; i < s.length(); i++){
            HashMap<Character, Integer> totalCount = new HashMap<>();

            // check all substrings up to current letter for anagrams
            for(int end = i; end >= 0; end--){
                if(totalCount.containsKey(s.charAt(end)))
                    totalCount.put(s.charAt(end), totalCount.get(s.charAt(end)) + 1);
                else
                    totalCount.put(s.charAt(end), 1);

                // count the letters in substring(start, end)
                for(int start = 0; start < end; start++){
                    HashMap<Character, Integer> substringCount = new HashMap<>();
                    int subStart = start;

                    for(int count = 0; count <= i - end; count++){
                        if(substringCount.containsKey(s.charAt(subStart)))
                            substringCount.put(s.charAt(subStart), substringCount.get(s.charAt(subStart)) + 1);
                        else
                            substringCount.put(s.charAt(subStart), 1);
                        subStart++;
                    }

                    // if the letter count of the current substring does not match the total word count,
                    // the string is not an anagram
                    boolean isAnagram = true;
                    for(Map.Entry<Character, Integer> letter : totalCount.entrySet()){
                        if(letter.getValue() != substringCount.get(letter.getKey())){
                            isAnagram = false;
                            break;
                        }
                    }
                    if(isAnagram)
                        pairs++;
                }
            }
        }

        return pairs;
    }

    public static void main(String[] args) {
        System.out.println(solution("abba"));
        System.out.println(solution("abcd"));
    }
}
