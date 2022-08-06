/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CircularLinkedList;

/**
 *
 * @author AS KHAN
 */
public class ClinkedList<T> {
    class Node{
        T data;
        Node next;
        Node prev;
    }
    Node start=null;
    Node end=null;
    int count=0;
    public boolean isEmpty(){
        return (start==null && end  ==null);
    }
    public void insertionAtStart(T value){
        Node n = new Node();
        n.data=value;
        if(isEmpty()){
             n.next=n;
            n.prev=n;
            start=end=n;
        }
        else{
            n.next=start;
            n.prev=end;
            end.next=n;
            start=n;
        }
        count++;
    }
     public void insertionAtEnd(T value){
        Node n = new Node();
        n.data=value;
        if(isEmpty()){
            n.next=n;
            n.prev=n;
            start=end=n;
        }
        else{
                        n.next=start;
            n.prev=end;
            end.next=n;
            end=n;
        }
        count++;
    }
     public T deleteAtStart(){
         T val=start.data;
         
         if(isEmpty()){
             System.out.println("List is Empty.");
             return null;
         }
         else{
             if(start==end){
                 start.next=null;
                 start.prev=null;
                start=end=null;
             }
             else{
                 start=start.next;
                 start.prev=end;
                 end.next=start;
             }
         }
         count--;
         return val;
     }
          public T deleteAtEnd(){
                  T val=null;
         
         if(isEmpty()){
             System.out.println("List is Empty.");
             return null;
         }
         else{
             if(start==end){
                 val=end.data;
                 end.next=null;
                 end.prev=null;
                start=end=null;
             }
             else{
                 val=end.data;
                 end=end.prev;
                 start.prev=end;
                 end.next=start;
             }
         }
         count--;
         return val;
     }
          public int size(){
              return count;
          }
          public T peekStart(){
              if(isEmpty())
                  return null;
              return start.data;
          }
          public T peekEnd(){
              return end.data;
          }
          public void print(){
              System.out.print("List :");
              for (int i = 0; i < count; i++) {
                  System.out.print(" "+start.data);
                  start=start.next;
              }
          }
}
