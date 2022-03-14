package com.careerdevs.problems;

public class BinaryGap {

    public static int solution(int N) {
        // Attempt 1 - Long
//        int length = 0;
//
//        long NBinary = Long.parseLong(Long.toBinaryString(N));
//        for(int temp = -1; NBinary > 0; NBinary /= 10){
//            if(NBinary % 10 == 0 && temp != -1){
//                temp++;
//            }
//            else if(NBinary % 10 == 1){
//                if(temp > length)
//                    length = temp;
//                temp = 0;
//            }
//        }
//
//        return length;

        // Attempt 2 - String
    int length = 0;

    String NBinary = Integer.toBinaryString(N);
    int temp = 0;
    for(char x : NBinary.toCharArray()){
        if(x == '0'){
            temp++;
        }
        else{
            if(temp > length)
                length = temp;
            temp = 0;
        }
    }

        return length;

    }

    public static void main(String[] args) {
        System.out.println(solution(1041));
        System.out.println(solution(9));
        System.out.println(solution(529));
        System.out.println(solution(20));
        System.out.println(solution(15));
        System.out.println(solution(32));
    }
}
