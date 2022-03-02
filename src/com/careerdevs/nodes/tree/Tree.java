package com.careerdevs.nodes.tree;

public class Tree {
    public static void main(String[] args) {
        Node<Integer> head = null;

        head = addNode(head, 6);
        head = addNode(head, 3);
        head = addNode(head, 9);
        head = addNode(head, 5);

        System.out.println(head.value);
        System.out.println(head.left.value + " " + head.right.value);
        System.out.println(" " + head.left.right.value);
    }

    public static Node<Integer> addNode(Node<Integer> head, int val){
        if(head == null)
            return new Node<>(val);

//        if(val < head.value)
//            head.left = addNode(head.left, val);
//        else if(val > head.value)
//            head.right = addNode(head.right, val);

        Node<Integer> node = head;

        while(true){
            if(val < node.value){
                if(node.left == null) {
                    node.left = new Node<>(val);
                    break;
                }
                node = node.left;
            }
            else{
                if(node.right == null) {
                    node.right = new Node<>(val);
                    break;
                }
                node = node.right;
            }
        }

        return head;
    }
}
