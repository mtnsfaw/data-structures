package com.atguigu.queue;

import java.util.Arrays;

/**
 * @Description TODO
 * @Author linjie
 * @Date 2022/5/27 16:26
 * @Version 1.0
 */
public class CircleArrayQueue {

    private int maxSize; // 表示数组的最大容量
    //front 变量的含义做一个调整： front 就指向队列的第一个元素, 也就是说 arr[front] 就是队列的第一个元素
    //front 的初始值 = 0
    private int front;
    //rear 变量的含义做一个调整：rear 指向队列的最后一个元素的后一个位置. 因为希望空出一个空间做为约定.
    //rear 的初始值 = 0
    private int rear; // 队列尾
    private int[] arr; // 该数据用于存放数据, 模拟队列

    public CircleArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
    }

    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public void addQueue(int n) {
        if (isFull()) {
            System.out.println("队列满，不能添加数据。");
        }
        arr[rear] = n;
        rear = (rear + 1) % maxSize;
    }

    public int getQueue() {
        if(isEmpty()) {
            throw new RuntimeException("队列空，不能取数据。");
        }
        int value = arr[front];
        front = (front + 1) % maxSize;
        return value;
    }

    public void showQueue() {
        if(isEmpty()) {
            System.out.println("队列空，没有数据。");
        }
        for (int i = front; i < front + size(); i++) {
            System.out.printf("arr[%d]=%d\n", i%maxSize, arr[i%maxSize]);
        }
    }

    public int size() {
        return (rear + maxSize - front) % maxSize;
    }

    /**
     *  显示队列头数据
     */
    public int headQueue() {
        if(isEmpty()) {
            throw new RuntimeException("队列空，不能取数据。");
        }
        return arr[front];
    }
}
