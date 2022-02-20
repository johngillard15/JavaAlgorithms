package com.careerdevs;

public class RemoveKFromList {

    public static ListNode<Integer> solution(ListNode<Integer> head, int k){
        if(head == null)
            return null;

        head.next = solution(head.next, k);

        if(head.value == k){
            return head.next;
        }

        return head;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
