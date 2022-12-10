import java.util.*;
public class Stack2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter stack size: ");

        int number = sc.nextInt();
        int[] array = new int[number];

        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i < array.length; i++){
            System.out.println("Enter your number: ");
            int value = sc.nextInt();
            stack.push(value);
        }
        System.out.println("The top element is " + stack.peek());
        System.out.println("The stack size is " + stack.size());

        while (!(stack.isEmpty())) {
            System.out.println(stack.pop());

        }
    }
}