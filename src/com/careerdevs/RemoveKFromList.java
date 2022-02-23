package com.careerdevs;

public class RemoveKFromList {

    public static ListNode<Integer> solution(ListNode<Integer> head, int k){
        while(head != null && head.value == k)
            head = head.next;

        ListNode<Integer> node = head;

        if(node != null){
            while(node.next != null){
                if(node.next.value == k)
                    node.next = node.next.next;
                else
                    node = node.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
