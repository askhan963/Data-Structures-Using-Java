/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author AS KHAN
 */
public class LlTest {
    public static void main(String[] args) {
        LL list = new LL();
       // list.print();

      //list.insertFirst(12);
             
        list.insertLast(66);
        list.insertLast(23);
        list.insertLast(123);
        list.insertLast(110);
     list.insertLast(111);
    // list.deleteAfter(23);
        System.out.println("");
     list.print();
     
        //System.out.println("--");
        list.insertionAfter(23, 33);
     //list.deleteAfter(123);
        System.out.println("");
     list.print();
     
       // System.out.println("---");
        list.deleteAfter(123);
        System.out.println("");
        list.print();
       // System.out.println("\n"+list.deleteFirst());
//        System.out.println(list.deleteLast());
//        System.out.println("--");
        
//     list.insertLast(110);
//     list.insertLast(110);
//     list.insertLast(110);
     
     
     
       //list.insertFirst(22);
       //list.insertLast(0);
      //  list.print();
      //  System.out.println(list.length());
    }
}
