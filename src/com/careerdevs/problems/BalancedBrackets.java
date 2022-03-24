package com.careerdevs.problems;

import java.util.ArrayList;
import java.util.List;

public class BalancedBrackets {

    public static String isBalanced(String s) {
        if(s.length() % 2 == 1)
            return "NO";

        List<Character> brackets = new ArrayList<>();

        for(char c : s.toCharArray()){
            switch(c){
                case '(', '{', '[' -> brackets.add(c);
                case ')' -> {
                    if(brackets.isEmpty() || brackets.get(brackets.size() - 1) != '(')
                        return "NO";
                    brackets.remove(brackets.size() - 1);
                }
                case '}' -> {
                    if(brackets.isEmpty() || brackets.get(brackets.size() - 1) != '{')
                        return "NO";
                    brackets.remove(brackets.size() - 1);
                }
                case ']' -> {
                    if(brackets.isEmpty() || brackets.get(brackets.size() - 1) != '[')
                        return "NO";
                    brackets.remove(brackets.size() - 1);
                }
            }
        }

        return brackets.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("{[(])}"));
        System.out.println(isBalanced("{[()]}"));
        System.out.println(isBalanced("{{[[(())]]}}"));
    }
}
