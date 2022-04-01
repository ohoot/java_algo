package chap04;

public class Q4 {

    public class EmptyQueueException extends RuntimeException{}
    public class QueueOverflowException extends RuntimeException{}

    int max;
    int pointer;
    int[] queue;

    public Q4(int max) {
        try {
            queue = new int[max];
            this.max = max;
        } catch (Exception e) {
            this.max = 0;
        }
    }

    public void enqueue(int x) throws QueueOverflowException {
        if (pointer >= max) {
            throw new QueueOverflowException();
        }

        queue[pointer++] = x;
    }

    public int dequeue() throws EmptyQueueException {
        if (pointer == 0) {
            throw new EmptyQueueException();
        }

        int outValue = queue[0];

        for (int i = 0; i < pointer; i++) {
            queue[i] = queue[i + 1];
        }

        pointer -= 1;
        return outValue;
    }
}
