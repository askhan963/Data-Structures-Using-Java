/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;

/**
 *
 * @author AS KHAN
 */
public class QueueByLinkedList<B> {
   class Node{
       B data;
       Node next;
   } 
   Node head=null;
   Node tail = null;
   int size =0;
   public boolean isEmpty(){
       if(head ==null){
           return true;
       }
       else{
           return false;
       }
   }
   public void enqueue(B val){
       Node n = new Node();
       n.data = val;
       n.next = null;
       if(head==null && tail==null){
           head = n;
           tail= n;
           size++;
       }
       else{
           Node x = tail;
           tail=n;
           x.next=tail;
           size++;
       }
   }
   public B dequeue(){
       if(isEmpty()){
           System.out.println(" Queue is Empty.");
           return null;
       }
       else{
           if(head==tail ){
               B value=head.data;
               head=null;
               tail=null;
               size--;
               return value;
           }
           else{
               B a = head.data;
               head=head.next;
               size--;
               return a;
           }
       }
   }
   public int size(){
       return size;
   }
   public B peek(){
       if(isEmpty()){
           System.out.println("Queue is Empty.");
           return null;
       }
       else{
           return head.data;
       }
   }
   
}
