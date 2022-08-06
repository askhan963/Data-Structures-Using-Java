/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CircularLinkedList;

/**
 *
 * @author AS KHAN
 */
public class Test {
    public static void main(String[] args) {
         ClinkedList<Integer> l = new ClinkedList<>();
         System.out.println("Size :"+l.size());
         System.out.println("Peek "+l.peekStart());
         l.insertionAtStart(12);
         l.insertionAtStart(13);
       
         l.insertionAtStart(14);
         l.insertionAtStart(16);
           l.insertionAtEnd(22);
         l.insertionAtEnd(55);
         l.print();
                  System.out.println("\nSize :"+l.size());
         System.out.println("Peek "+l.peekStart());

         System.out.println("Delete at Start : "+l.deleteAtStart());
           System.out.println("Delete at Start : "+l.deleteAtStart());
            System.out.println("Delete at Start : "+l.deleteAtStart());
//          System.out.println("Delete at Start : "+l.deleteAtStart());
//           System.out.println("Delete at Start : "+l.deleteAtStart());
//            System.out.println("Delete at Start : "+l.deleteAtStart());
                                System.out.println("Size :"+l.size());
         System.out.println("Peek "+l.peekStart());
                  System.out.println("Delete at End: "+l.deleteAtEnd());
               System.out.println("Delete at End: "+l.deleteAtEnd());
                 System.out.println("Delete at End: "+l.deleteAtEnd());
           System.out.println("Delete at End: "+l.deleteAtEnd());
//               System.out.println("Delete at End: "+l.deleteAtEnd());
//           System.out.println("Delete at End: "+l.deleteAtEnd());
               System.out.println("Size :"+l.size());

              

         
    }
    
}
