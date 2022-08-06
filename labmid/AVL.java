/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labmid;

/**
 *
 * @author AS KHAN
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AVL {
     
    JFrame frame;
     
    public AVL() { 
        //this is the constructor
        frame = new JFrame();
        frame.setTitle("My JFrame");
         JButton button = new JButton(); 
          JPanel panel = new JPanel();
          MyJComponent com = new MyJComponent(); 
        button.setText("Button");  
        JLabel label = new JLabel("JFrame By Example"); 
        panel.add(label);  
        panel.add(button);  
        frame.add(panel); 
        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(com); 
        frame.setVisible(true);
    }
    public static void main(String args[]) {
        //main method
        AVL test = new AVL();
    }
    class MyJComponent extends JComponent {  
      public void paint(Graphics g) {  
        g.setColor(Color.green);  
        g.fillRect(30, 30, 100, 100);  
      } 
    }
}
