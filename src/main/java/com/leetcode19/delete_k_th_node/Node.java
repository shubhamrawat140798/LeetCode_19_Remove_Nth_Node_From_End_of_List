package com.leetcode19.delete_k_th_node;

/**
 * Node class for node storing.
 */
public class Node {
    /**
     * for storing element.
     */
     int value;
    /**
     * for storing next node.
     */
    Node next;

    /**
     * for node initialization.
     * @param recivedValue storing value.
     */
    Node(final int recivedValue) {
        this.value = recivedValue;
        next = null;
    }
}
