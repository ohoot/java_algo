package main.sibata.chap04;

import java.util.EmptyStackException;

public class IntStack {
    int max;
    int pointer;
    int[] stack;

    public IntStack(int max) {
        try {
            stack = new int[max];
            this.max = max;
        } catch (OutOfMemoryError e) {
            this.max = 0;
        }
    }

    public int push(int x) throws StackOverflowError {
        if (pointer >= max) {
            throw new StackOverflowError();
        }

        return stack[pointer++] = x;
    }

    public int pop() throws EmptyStackException {
        if (pointer <= 0) {
            throw new EmptyStackException();
        }

        return stack[--pointer];
    }

    public int peek() throws EmptyStackException {
        if (pointer <= 0) {
            throw new EmptyStackException();
        }

        return stack[pointer - 1];
    }

    public int indexOf(int x) throws EmptyStackException {
        if (pointer <= 0) {
            throw new EmptyStackException();
        }

        int index = -1;
        for(int i = 0; i < pointer; i++) {
            if (stack[i] == x) {
                index = i;
                break;
            }
        }

        return index;
    }

    public void clear() {
        pointer = 0;
    }

    public int capacity() {
        return max;
    }

    public int size() {
        return pointer;
    }

    public boolean isEmpty() {
        return pointer <= 0;
    }

    public boolean isFull() {
        return pointer >= max;
    }

    public void dump() {
        if (pointer <=0) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i < pointer; i++) {
                System.out.println(stack[i] + " ");
            }
        }
    }
}
