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


/**
 *
 * @author AS KHAN
 */
// package Testing;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;

import java.awt.event.ActionListener;

import java.awt.event.KeyListener;

import javax.swing.JFrame;

import java.awt.event.ActionListener;

public class ab extends JFrame implements ActionListener, KeyListener {
	// Tree Root Node.




	public void paint(Graphics g) {
		super.paintComponents(g);

		g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(3.0f));

		Stack<Node> s = new Stack<>();
		Node curr = root;
		Points pts;
		int offset = topPanel.getBounds().height;
		while (!s.isEmpty() || curr != null) {
			while (curr != null) {
				s.push(curr);
				curr = curr.left;
			}
			if (!s.isEmpty())
				curr = s.pop();
			pts = curr.p;
			g2.drawLine(pts.x1 + 7, pts.y1 + 30 + offset, pts.x2 + 3, pts.y2 + 10 + offset);
			curr = curr.right;
		}

		// x1 = label.getX()+7
		// y1 = label.getY()+30
	}

	public BSTVisualization() {
		// Initialize the frame.
		initialize();
	}



	@Override
	public void actionPerformed(ActionEvent evt) {
	
	}

	

	@Override
	public void keyPressed(KeyEvent evt) {
	}

	@Override
	public void keyReleased(KeyEvent evt) {
	}



//	public static void main(String arg[]) {
//		BSTVisualization bst = new BSTVisualization();
//
//	}
}
