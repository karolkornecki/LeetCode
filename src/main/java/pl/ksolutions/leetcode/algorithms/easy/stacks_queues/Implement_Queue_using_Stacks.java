package pl.ksolutions.leetcode.algorithms.easy.stacks_queues;

import java.util.Stack;

/**
 * Difficulty: Easy
 * <p>
 * Implement the following operations of a queue using stacks.
 * <p>
 * push(x) -- Push element x to the back of queue.
 * pop() -- Removes the element from in front of queue.
 * peek() -- Get the front element.
 * empty() -- Return whether the queue is empty.
 * <p>
 * Notes:
 * <p>
 * You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
 * Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue), as long as you use only standard operations of a stack.
 * You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).
 *
 * @author Karol Kornecki
 */
public class Implement_Queue_using_Stacks {

    private Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        Implement_Queue_using_Stacks queue = new Implement_Queue_using_Stacks();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        while (!queue.empty()){
            System.out.print(queue.peek());
            queue.pop();
        }
    }

    // Push element x to the back of queue.
    public void push(int x) {
        Stack<Integer> s = new Stack<>();
        while (!stack.empty()) {
            s.push(stack.pop());
        }
        stack.push(x);
        while (!s.empty()) {
            stack.push(s.pop());
        }
    }

    // Removes the element from in front of queue.
    public void pop() {
        stack.pop();
    }

    // Get the front element.
    public int peek() {
        return stack.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack.empty();
    }
}
