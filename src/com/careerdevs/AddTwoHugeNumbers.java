package com.careerdevs;

public class AddTwoHugeNumbers {
    public static ListNode<Integer> solution(ListNode<Integer> a, ListNode<Integer> b) {
        ListNode<Integer> head = new ListNode(0);
        String aFull = "";
        String bFull = "";

        ListNode<Integer> temp = a;
        while(temp != null){
            int num = temp.value;
            while(num < 1000){
                num *= 10;
            }

            aFull += num;
            temp = temp.next;
        }

        temp = b;
        while(temp != null){
            int num = temp.value;
            while(num < 1000){
                num *= 10;
            }

            bFull += num;
            temp = temp.next;
        }

        String sum = "" + Long.valueOf(aFull) + Long.valueOf(bFull);

        temp = head;
        for(int start = 0; sum.length() > 0; start += 4){
            int end = Math.min(start + 4, sum.length());
            String num = sum.substring(start, end);

            temp.value = Integer.valueOf(num);
            sum = sum.substring(end);

            if(sum.length() > 0)
                temp.next = new ListNode(0);
        }

        return head;
    }

    public static void main(String[] args) {

    }
}
