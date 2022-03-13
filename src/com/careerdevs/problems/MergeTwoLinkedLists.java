package com.careerdevs.problems;

import com.careerdevs.problems.resources.ListNode;

public class MergeTwoLinkedLists {

    public static ListNode<Integer> solution(ListNode<Integer> l1, ListNode<Integer> l2) {
        ListNode<Integer> mergedList = new ListNode(69);
        ListNode<Integer> head = mergedList;
        int num;

        while(l1 != null || l2 != null){
            if(l1 != null && l2 == null){
                num = l1.value;
                l1 = l1.next;
            }
            else if(l1 == null && l2 != null){
                num = l2.value;
                l2 = l2.next;
            }
            else{
                if(l1.value < l2.value){
                    num = l1.value;
                    l1 = l1.next;
                }
                else{
                    num = l2.value;
                    l2 = l2.next;
                }
            }

            mergedList.next = new ListNode(num);
            mergedList = mergedList.next;
        }

        return head.next;
    }
}
