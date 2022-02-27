package com.careerdevs.nodes.LinkedList;

public class LinkedList {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(4);
        head = addNode(head, 2);
        head = addNode(head, 8);
        head = addNode(head, 5);
        head = addNode(head, 9);

        assertResult(head.value == 4);
        assertResult(head.next.value == 2);
        assertResult(head.next.next.value == 8);
        assertResult(head.next.next.next.value == 5);
        assertResult(head.next.next.next.next.value == 9);

        displayNode(head);
    }

    public static void assertResult(boolean result){
        System.out.println(result ? "success" : "fail");
    }

    public static Node<Integer> addNode(Node<Integer> head, int value){
        Node<Integer> newNode = new Node<>(value);

        if(head == null){
            return newNode;
        }

        Node<Integer> current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;

        return head;
    }

    public static void displayNode(Node<Integer> head){
        Node<Integer> node = head;
        String nodes = node.value.toString();
        node = node.next;

        while(node != null){
            nodes += ", " + node.value;
            node = node.next;
        }

        System.out.println(nodes);
    }

    public static void find(Node<Integer> head, int query){

    }

    public static void remove(Node<Integer> head, int vert){

    }
}