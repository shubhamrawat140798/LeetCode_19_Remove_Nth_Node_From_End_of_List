package com.leetcode19.delete_k_th_node;
/**
 * for creation of linked list.
 */
public class LinkedList {

    /**
     * for storing head of linked list.
     */
    private Node head = null;
    /**
     * for storing tail of linked list.
     */
    private Node tail = null;
    /**
     * for storing total number of node present in the linked list.
     */
    private int nodeCounter = 0;

    /**
     * for adding nodes in linked list.
     * @param value for adding new element into linked list.
     */
    public void addNode(final int value) {
        final Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println("Node is added");
        nodeCounter++;
    }

    /**
     * for printing the linked list.
     */
    public void printLinkedList() {
        Node temporaryNode = head;
        System.out.println("\nLinkedList: ");
        while (temporaryNode != null) {
          System.out.print(temporaryNode.value + " ");
          temporaryNode = temporaryNode.next;
        }
    }

    /**
     * for deleting element for the last of the linked list(n-k).
     * @param kthPosition for deleting element from last(tail).
     */
    public void deleteKthNode(final int kthPosition) {
        if (kthPosition > nodeCounter) {
            System.out.print("\nError: Linked list out of Bound: ");
            System.out.print("k th position > linked list size");
            return;
        }   else if (kthPosition == nodeCounter) {
            head = head.next;
            return;
        }   else if (kthPosition == 0) {
            return;
        }
        Node firstPointer = head;
        Node secondPointer = head;
        for (int nodePosition = 0; nodePosition < kthPosition + 1;
        nodePosition++) {
            firstPointer = firstPointer.next;
        }
        while (firstPointer != null) {
            secondPointer = secondPointer.next;
            firstPointer = firstPointer.next;
        }
        secondPointer.next = secondPointer.next.next;

    }
}
