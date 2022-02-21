package com.careerdevs;

import java.util.ArrayList;
import java.util.List;

public class IsListPalindrome {
    public static boolean solution(ListNode<Integer> head) {
        boolean isPalindrome = true;
        List<Integer> numbers = new ArrayList();
        ListNode<Integer> temp = head;

        while(temp != null){
            numbers.add(temp.value);
            temp = temp.next;
        }

        for(int i = 0; i < numbers.size() / 2; i++){
            System.out.println(numbers.get(i) + " = " + numbers.get(numbers.size() - 1 - i));
            System.out.println(numbers.get(i) == numbers.get(numbers.size() - 1 - i));

            if(numbers.get(i) != numbers.get(numbers.size() - 1 - i)){
                isPalindrome = false;
                // break;
            }
        }

        return isPalindrome;
    }

    public static void main(String[] args) {
        ListNode<Integer> head = new ListNode<>(0);
        System.out.println(solution(head));
    }
}
