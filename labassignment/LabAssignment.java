/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labassignment;

/**
 *
 * @author AS KHAN
 */
public class LabAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SinglyCircularLL<Integer>  s = new  SinglyCircularLL<Integer>();
      s.insertAtStart(1);
       s.insertAtStart(2);
       s.insertAtEnd(3);
       s.insertAtEnd(4);
              s.insertAtStart(6);
      s.insertAtStart(8);
      s.insertAtEnd(5);
       s.insertAtEnd(9);
       s.print();
        System.out.println(""+s.deleteAtEnd());
        System.out.println(""+s.deleteAtEnd());
                System.out.println(""+s.deleteAtEnd());
        System.out.println(""+s.deleteAtEnd());
    }
    
}
