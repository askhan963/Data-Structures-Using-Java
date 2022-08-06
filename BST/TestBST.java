/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BST;

/**
 *
 * @author AS KHAN
 */
public class TestBST {
    public static void main(String[] args) {
        BST b = new BST();
        b.insert(52);
       b.insert(2);
        b.insert(8);
          b.insert(11);
        b.insert(13);
        b.insert(1);
          b.insert(6);
        b.insert(4);
        b.insert(15);
        b.inOrder();
    }
}
