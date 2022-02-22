package com.careerdevs;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IsListPalindrome {
    public static boolean solution(ListNode<Integer> head) {
        List<Integer> numbers = new ArrayList();
        ListNode<Integer> temp = head;

        while(temp != null){
            numbers.add(temp.value);
            temp = temp.next;
        }

        for(int i = 0; i < numbers.size() / 2; i++){
            if(!Objects.equals(numbers.get(i), numbers.get(numbers.size() - 1 - i)))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        ListNode<Integer> head = new ListNode<>(0);
        System.out.println(solution(head));
    }
}
