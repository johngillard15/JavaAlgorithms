package com.careerdevs.problems;

public class Encryption {

    public static String solution(String s){
        String encrypted = "";

        s.replaceAll("\\s", "");

        double sqrtLength = Math.sqrt(s.length());
        int rows = (int) sqrtLength;
        int cols = sqrtLength == (int)sqrtLength
                ? rows
                : (int) Math.ceil(sqrtLength);

        for(int i = 0; encrypted.length() - rows - 1 < s.length(); i = (i + cols) % s.length()){
            if(i % cols == 0)
                encrypted += " ";
            encrypted += s.charAt(i);
        }

        return encrypted;
    }

    public static void main(String[] args) {
        solution("haveaniceday");
    }
}
