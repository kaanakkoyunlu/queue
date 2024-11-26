package Algorithms;

public class myQueue {

    private int size;
    private int front;
    private int rear;
    private int[] arr;

    public myQueue(int size) {

        this.size=size;
        this.front=0;
        this.rear=-1;
        this.arr= new int[size];
    }

    public void enqueue(int val) {

        if(rear<size-1){
            arr[++rear] = val;
        }
        else {
            System.out.println("Queue is full");
        }
    }

    public int dequeue() {

        if(!isEmpty()) {
            int value = arr[front++];
            return value;
        }
        else {
            return -1;
        }
    }

    public int peek() {

        if(!isEmpty()) {
            return  arr[front];
        }
        else {
            return -1;
        }
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public boolean isFull() {
        return rear == size-1;
    }

    public void displayQueue() {

        if(!isEmpty()) {
            for(int i=front;i<=rear;i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        else {
            System.out.println("Queue is empty");
        }
    }

    public static void main(String[] args) {

        myQueue que = new myQueue(3);
        que.enqueue(1);
        que.enqueue(2);
        que.enqueue(3);

        que.displayQueue();
        System.out.println("-".repeat(30));
        que.dequeue();
        que.displayQueue();
        System.out.println("-".repeat(30));
        que.dequeue();
        que.displayQueue();
        que.dequeue();
        System.out.println(que.isEmpty());
        
    }
}
