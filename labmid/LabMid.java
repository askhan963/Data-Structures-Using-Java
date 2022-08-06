/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labmid;

/**
 *
 * @author AS KHAN
 */
public class LabMid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Randomizer a = new Randomizer(10);
        System.out.println("Initialized Array  with -ve Numbers:");
        a.print();
        System.out.println("Size of Present Elements: "+a.size);
        
        a.insert(-1);
       a.insert(123);
       a.insert(2);
       a.insert(93);
       a.insert(25);
       a.insert(90);
       a.insert(21);
        System.out.println("After Random insertion");
       a.print();
        System.out.println("Size of Present Elements: "+a.size);
 
a.delete();
a.delete();
       System.out.println("After Random deletion");
        a.print();
         System.out.println("Size of Present Elements: "+a.size);
       // a.insert(99);
    }
    
}
