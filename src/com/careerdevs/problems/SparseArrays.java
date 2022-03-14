package com.careerdevs.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SparseArrays {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        Map<String, Integer> stringMap = new HashMap<>();
        List<Integer> results = new ArrayList<>();

        for(String string : strings){
            if(stringMap.containsKey(string))
                stringMap.put(string, stringMap.get(string) + 1);
            else
                stringMap.put(string, 1);
        }

        for(String string : queries)
            results.add(stringMap.getOrDefault(string, 0));

        return results;
    }
    public static void main(String[] args) {

    }
}
