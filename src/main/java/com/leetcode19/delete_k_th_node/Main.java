package com.leetcode19.delete_k_th_node;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    /**
     * for taking inputs.
     * @param args for taking inputs from commandline.
     */
    public static void main(final String[] args) {
        LinkedList list = new LinkedList();
        try (Scanner scanner = new Scanner(System.in)) {
            char choice;
            do {
                System.out.print("\n Enter a node value: ");
                int valueOfNode = scanner.nextInt();
                list.addNode(valueOfNode);
                do {
                    System.out.print("\nDo you want to continue y/n: ");
                    choice = scanner.next().charAt(0);
                    if (choice != 'y' && choice != 'n') {
                        System.out.println("Wrong Input: " + choice);
                        System.out.println("Input only y or n");
                    }
                } while (choice != 'y' && choice != 'n');
            } while (choice == 'y');
            list.printLinkedList();
            System.out.print("\n Enter the Kth element you want "
                    +
            "to delete at the end: ");
            int kthElement = scanner.nextInt();
            list.deleteKthNode(kthElement);
            list.printLinkedList();
        } catch (InputMismatchException exception) {
            System.out.println("Input Mismatch Exception occur");
            System.out.println("(Enter Integer only):\n" + exception);
        } catch (Exception exception) {
            System.out.println("Exception occur:\n" + exception);
        }
//        list.addNode(1);
//        list.addNode(2);
//        list.addNode(3);
//        list.addNode(4);
//        list.printLinkedList();
//        list.deleteKthNode(4);
//        list.printLinkedList();
    }
}
