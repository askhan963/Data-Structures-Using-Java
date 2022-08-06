/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;

/**
 *
 * @author AS KHAN
 */
public class QueueByArray<B> {
    B [] arr;
    int tail=-1;
    int head=0;

    public QueueByArray(int s) {
       arr =(B[]) new Object[s];
    }
    public boolean isFull(){
     return tail>=arr.length-1;
    }
    public boolean isEmpty(){
          return tail<head; 
    }
    public void enqueue(B value){
        if(isFull()){
            System.out.println("Queue  is full.");
        }
        else {
            tail++;
            arr[tail]= value;
        }
    }
    public B dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return null;
        }
        else{
            B val = arr[head];
            head++;
            return val;
        }
    }
    public int size(){
        return tail+1;
    }
    public B peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty.");
            return null;
        }
        else {
            return arr[head];
        }
    }
}
