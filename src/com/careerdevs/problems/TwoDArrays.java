package com.careerdevs.problems;

public class TwoDArrays {

    public static void solution(int[][] arr){
        int rows = 6, cols = 6;
        int lastSum = 0;

        int max = Integer.MIN_VALUE;
        for(int row = 0; row < rows - 2; row++){
            for(int col = 0; col < cols - 2; col++){
                int sum = 0;
                if(col == 0){
                    sum = lastSum = arr[row][col] + arr[row][col + 1] + arr[row][col + 2]
                        + arr[row + 1][col + 1]
                        + arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2];
                }
//                else{
//                    sum = lastSum - (arr[row][col - 1] + arr[row + 1][col] + arr[row + 2][col - 1])
//                        + arr[row][col + 2] + arr[row + 1][col + 1] + arr[row + 2][col - 1];
//                }

                if(sum > max)
                    max = sum;
            }
        }

        System.out.println(max);
    }

    public static void main(String[] args) {
        solution(new int[][]{
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        });
    }
}
