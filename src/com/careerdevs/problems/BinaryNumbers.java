package com.careerdevs.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BinaryNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        Pattern regex = Pattern.compile("1+");
        Matcher match = regex.matcher(Integer.toString(n, 2));

        List<String> matchList = new ArrayList<>();
        while(match.find())
            matchList.add(match.group());

        int longest = matchList.stream()
                .map(String::length)
                .max(Integer::compareTo)
                .get()
                ;

        System.out.println(longest);
    }
}
