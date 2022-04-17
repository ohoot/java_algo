package main.sibata.chap04;

public class RingBuffer {
    /**
     * 현재 아이템 개수 변수를 사용하지 않고 구현
     */

    public class RingBufferQueueOverflowException extends RuntimeException{}
    public class EmptyRingBufferQueueException extends RuntimeException{}

    int max;
    int front;
    int rear;
    int[] queue;
    boolean isFull;
    boolean isEmpty;

    public RingBuffer(int max) {
        try {
            queue = new int[max];
            this.max = max;
        } catch (OutOfMemoryError e) {
            this.max = 0;
        }
    }

    public void enqueue(int x) throws RingBufferQueueOverflowException {
        if (isFull) {
            throw new RingBufferQueueOverflowException();
        }

        queue[rear++] = x;

        if (isEmpty) {
            isEmpty  = false;
        }

        if (front == rear) {
            isFull = true;
        }

        if (rear == max) {
            rear = 0;
        }
    }

    public int dequeue() throws EmptyRingBufferQueueException {
        if(isEmpty) {
            throw new EmptyRingBufferQueueException();
        }

        int outValue = queue[--front];

        if (isFull) {
            isFull = false;
        }

        if (front == rear) {
            isEmpty = true;
        }

        if (front == max) {
            front = 0;
        }

        return outValue;
    }

    public int getCurrentCount() {
        if (front == rear) {
            if (isFull) {
                return max;
            } else {
                return 0;
            }
        } else if (front > rear) {
            return max - (front - rear);
        } else {
            return rear - front;
        }
    }

    public int indexOf(int x) throws EmptyRingBufferQueueException {
        if (isEmpty) {
            throw new EmptyRingBufferQueueException();
        }

        int index = -1;
        for (int i = front; i != rear; i++) {
            if (i >= max) {
                i = 0;
            }

            if (queue[i] == x) {
                index = i;
            }
        }

        return index;
    }

}
