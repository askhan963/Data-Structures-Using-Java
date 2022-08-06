/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;

/**
 *
 * @author AS KHAN
 */
public class CircularQueueByArray<T> {
   private T arr[];
   private int tail=-1;
   private int head=0;
   public CircularQueueByArray(int n){
       arr=(T[]) new Object[n];
   }
   private boolean isEmpty(){
       return tail<head;
   }
   private boolean isFull(){
       return tail-head>=arr.length-1;
   }
   public void enqueue(T val){
       if(isFull()){
           System.out.println("Queue is Full.");
       }
       else{
           tail++;
           arr[tail%arr.length]=val;
           
       }
   }
   public T dequeue(){
       if(isEmpty()){
           System.out.println(" Queue is Empty.");
           return null;
       }
       else{
           T val = arr[head%arr.length];
           head++;
           return val;
       }
   }
   public T peek(){
       if(isEmpty()){
           System.out.println(" Queue is Empty.");
           return null;
       }
       else{
           return arr[head];
       }
   }
   public int size(){
       return tail-head+1;
   }
}
