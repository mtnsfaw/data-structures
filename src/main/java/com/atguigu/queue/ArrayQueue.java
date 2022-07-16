package com.atguigu.queue;

import java.util.Arrays;

/**
 * @Description TODO
 * @Author linjie
 * @Date 2022/5/27 10:56
 * @Version 1.0
 */
public class ArrayQueue {

    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = -1;
        rear = -1;
    }

    public boolean isFull() {
        return rear == maxSize - 1;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public void addQueue(int n) {
        if(isFull()) {
            System.out.println("队列满，不能添加数据。");
        }
        rear++;
        arr[rear] = n;
    }

    public int getQueue() {
        if(isEmpty()) {
            throw new RuntimeException("队列空，不能取数据。");
        }
        front++;
        return arr[front];
    }

    public void showQueue() {
        if(isEmpty()) {
            System.out.println("队列空，没有数据。");
        }
        Arrays.stream(arr).forEach(a-> System.out.println(a));
    }

    /**
     *  显示队列头数据
     */
    public int headQueue() {
        if(isEmpty()) {
            throw new RuntimeException("队列空，不能取数据。");
        }
        return arr[front + 1];
    }
}
