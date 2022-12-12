import java.util.*;
import java.util.Scanner;

public class Stack2 {

    Node head;

    static class Node {
        int value;
        Node next;

        Node(int d) {
            value = d;
            next = null;
        }
    }

    public void push(int value) {
        Node new_node = new Node(value);
        new_node.next = head;
        head = new_node;
    }

    public void pop() {
        if (head == null) {
            System.out.println("Stack is empty");
        } else {
            head = head.next;
        }
    }

    public void isEmpty() {
        if (head == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }

    public void size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Size of stack is " + count);
    }

    public void topElement() {
        if (head == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element is " + head.value);
        }
    }

    public void printStack() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Stack2 stack = new Stack2();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 6) {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Is Empty");
            System.out.println("4. Size");
            System.out.println("5. Top Element");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    stack.printStack();
                    break;
                case 2:
                    stack.pop();
                    stack.printStack();
                    break;
                case 3:
                    stack.isEmpty();
                    break;
                case 4:
                    stack.size();
                    break;
                case 5:
                    stack.topElement();
                    break;
            }
        }
        sc.close();
    }
}