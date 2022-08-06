/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queue;

/**
 *
 * @author AS KHAN
 */
public class Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CircularQueueByArray<Integer> a = new CircularQueueByArray<>(6);
        System.out.println("Size "+a.size());
        System.out.println("Deleted "+a.dequeue());
        a.enqueue(3);
        a.enqueue(2);
        a.enqueue(1);
        System.out.println("Peek "+a.peek());
        System.out.println("Size "+a.size());
        System.out.println("");
        System.out.println("Deleted "+a.dequeue());
        System.out.println("Deleted "+a.dequeue());
        System.out.println("Deleted "+a.dequeue());
        System.out.println("Deleted "+a.dequeue());
        System.out.println("Size "+a.size());
//QueueByLinkedList<Integer>  a = new QueueByLinkedList<>();
//
//        System.out.println("Size "+a.size());
//        System.out.println("Deleted "+a.dequeue());
//        a.enqueue(30);
//        a.enqueue(20);
//        a.enqueue(10);
//        System.out.println("Peek "+a.peek());
//        System.out.println("Size "+a.size());
//        System.out.println("");
//        System.out.println("Deleted "+a.dequeue());
//        System.out.println("Peek "+a.peek());
//        System.out.println("Size "+a.size());
//       System.out.println("\nDeleted "+a.dequeue());
//         System.out.println("Peek "+a.peek());
//         System.out.println("Size "+a.size());
//        System.out.println("\nDeleted "+a.dequeue());
//        
//         System.out.println("\nPeek "+  a.peek());
//        System.out.println("Size "+a.size());
      //  System.out.println("Deleted "+a.dequeue());
    }
    
}
