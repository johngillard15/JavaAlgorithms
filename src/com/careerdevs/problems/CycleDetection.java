package com.careerdevs.problems;

import com.careerdevs.problems.resources.ListNode;

import java.util.HashSet;

public class CycleDetection {

    public static boolean hasCycle(ListNode head) {
        HashSet<ListNode> nodes = new HashSet<ListNode>();

        while (true) {
            if (head.next == null)
                return false;
            if (nodes.contains(head.next))
                return true;

            nodes.add(head);
            head = head.next;
        }
    }
}
