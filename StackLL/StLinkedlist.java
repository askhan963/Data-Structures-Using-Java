/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StackLL;

/**
 *
 * @author AS KHAN
 */
public class StLinkedlist<T> {
 Nud top;
 int size=0;
 public void push(T value){
     Nud n = new Nud();
     n.data=value;
     if(top==null){
         top = n;
         n.next=null;
     }
     else{
         n.next=top;
         top = n;
     }
     size++;
 }
 public T pop(){
     if(top==null){
         System.out.println("Stack Underflow");
         return null;
     }
     else{
         T value=(T) top.data;
         top=top.next;
         size--;
         return value;
     }
 }
 public T peek(){
     if(top==null){
         System.out.println("Stack Empty");
         return null;
     }
     else{
         T value=(T) top.data;
         return value;
     }     
     
 }
 public int size(){
     return size;
 }
}