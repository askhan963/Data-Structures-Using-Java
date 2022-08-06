/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labassignment;

/**
 *
 * @author AS KHAN
 */
public class SinglyCircularLL<B> {
    class Node{
        B data;
        Node prev=null;
    }
    Node start=null;
    int count =0;
    public boolean isEmpty(){
        return start==null;
    }
    public void insertAtStart(B val){
        Node n = new Node();
        n.data=val;
        if(isEmpty()){
            n.prev=n;
            start=n;
        }
        else{
            n.prev=start.prev;
            start.prev=n;
            start=n;
        }
        count++;
    }
        public void insertAtEnd(B val){
                Node n = new Node();
        n.data=val;
        if(isEmpty()){
            n.prev=n;
            start=n;
        }
        else{
            n.prev=start.prev;
           start.prev=n;
           
           
        }
        count++;
    }
            public B deleteAtEnd(){
        if(isEmpty()){
            System.out.println("List is Empty.");
            return null;
        }
        else{
            if(count==1){
               B val=start.data;
               start.prev=null;
               start=null;
               count--;
               return val;
            }
            else{
            Node n = start.prev;
            B val=n.data;
            start.prev=n.prev;
            count--;
            return val;
            }
        }
        }
            public void print(){
                System.out.println("List is: End----Start");
                Node n = start.prev;
                for (int i = count; i > 0; i--) {
                    System.out.print(" "+n.data);
                    n=n.prev;
                }
                System.out.println("\n---");
            }
    }

