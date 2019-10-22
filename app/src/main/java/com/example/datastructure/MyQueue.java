package com.example.datastructure;

public class MyQueue {

    static int front;
    static int rear;
    static int capacity;
    static int[] array;

    public MyQueue(int capacity) {
        this.capacity = capacity;
        this.front = 0;
        this.rear = 0;
        this.array = new int[capacity];
    }

    public static void queueEnqueue(int data){
        if(capacity == rear){
            System.out.println("LOG:-Queue is full");
            return;
        }else {
            array[rear] = data;
            rear++;
        }
    }

    public static void dequeEnqueue(){
        if(front == rear){
            System.out.println("LOG:-Queue is Empty");
        }else {
            for(int i = 0; i<array.length-1; i++){
                array[i] = array[i+1];
            }

            if(rear < capacity){
                array[rear] = 0;
                rear--;
            }
        }
    }

    public static void displayQueue(){
        if(rear == front){
            System.out.println("LOG:-Queue is empty");
            return;
        }

        for(int i = front; i<rear; i++){
            System.out.println("LOG:-Item-"+array[i]);
        }

    }

    public static void getFront(){
        if (front == rear) {
            System.out.printf("LOG:Queue is Empty");
        }
        System.out.printf("LOG:-Front Element is: %d", array[front]);
    }




}
