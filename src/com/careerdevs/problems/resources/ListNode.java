package com.careerdevs.problems.resources;


public class ListNode<T>{
    public ListNode(T x) {
        value = x;
    }

    public T value;
    public ListNode<T> next;
}