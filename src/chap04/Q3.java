package chap04;

import java.util.EmptyStackException;

public class Q3 {
    int max;
    int pointerA;
    int pointerB;
    int[] stack;

    public Q3(int max) {
        stack = new int[max];
        this.max = max;
        pointerB = max - 1;
    }

    public void putA(int x) throws StackOverflowError {
        if (pointerA == pointerB + 1) {
            throw new StackOverflowError();
        }

        stack[pointerA++] = x;
    }

    public int popA() throws EmptyStackException {
        if (pointerA <= 0) {
            throw new EmptyStackException();
        }

        return stack[--pointerA];
    }

    public int IndexOfA(int x) throws EmptyStackException {
        if (pointerA <= 0) {
            throw new EmptyStackException();
        }

        int index = -1;
        for (int i = pointerA - 1; i >= 0; i--) {
            if (stack[i] == x) {
                index = i;
                break;
            }
        }

        return index;
    }

    public int peekA() throws EmptyStackException {
        if (pointerA <= 0) {
            throw new EmptyStackException();
        }

        return stack[pointerA - 1];
    }

    public void putB(int x) throws StackOverflowError {
        if (pointerA == pointerB + 1) {
            throw new StackOverflowError();
        }

        stack[pointerB--] = x;
    }

    public int popB() throws EmptyStackException {
        if (pointerB >= max - 1) {
            throw new EmptyStackException();
        }

        return stack[++pointerB];
    }

    public int IndexOfB(int x) throws EmptyStackException {
        if (pointerB >= max - 1) {
            throw new EmptyStackException();
        }

        int index = -1;
        for (int i = pointerB + 1; i <= max - 1; i++) {
            if (stack[i] == x) {
                index = i;
                break;
            }
        }

        return index;
    }

    public int peekB() throws EmptyStackException {
        if (pointerB >= max - 1) {
            throw new EmptyStackException();
        }

        return stack[pointerB + 1];
    }
}
