package com.careerdevs;

import java.util.HashMap;
import java.util.Map;

public class SherlockAndAnagrams {

    public static int solution(String s){
        int pairs = 0;

        for(int i = 0; i < s.length(); i++){
            HashMap<Character, Integer> wordCount = new HashMap<>();

            // check all substrings up to current letter for anagrams
            for(int end = i; end >= 0; end--){
                if(wordCount.containsKey(s.charAt(end)))
                    wordCount.put(s.charAt(end), wordCount.get(s.charAt(end)) + 1);
                else
                    wordCount.put(s.charAt(end), 1);

                // count the letters in substring(start, end)
                for(int start = 0; start < end; start++){
                    HashMap<Character, Integer> substringCount = new HashMap<>();
                    int x = start;

                    for(int count = 0; count <= i - end; count++){
                        if(substringCount.containsKey(s.charAt(x)))
                            substringCount.put(s.charAt(x), substringCount.get(s.charAt(x)) + 1);
                        else
                            substringCount.put(s.charAt(x), 1);
                        x++;
                    }

                    // if the letter count of the current substring does not match the total word,
                    // the string is not an anagram
                    boolean isAnagram = true;
                    for(Map.Entry<Character, Integer> letter : substringCount.entrySet()){
                        if(letter.getValue() != wordCount.get(letter.getKey())){
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
