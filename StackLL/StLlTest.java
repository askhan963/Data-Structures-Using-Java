/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StackLL;

import java.util.Scanner;

/**
 *
 * @author AS KHAN
 */
public class StLlTest {
    public static void main(String[] args) {
         StLinkedlist<Integer> st = new StLinkedlist<>();
Scanner in = new Scanner(System.in);
         int choice=0;
         do{
         System.out.println("--------");
         
         System.out.println("1. Push ");
         System.out.println("2. Pop ");
         System.out.println("3. Size ");
         System.out.println("4. Peek ");
         System.out.println("5. Qiut ");
         System.out.println("Select : ");
         choice=in.nextInt();
         switch(choice){
             case 1:
                 System.out.println("Enter value: ");
                 st.push(in.nextInt());
                 break;
                 case 2:
                     System.out.println(" Pop "+st.pop());
                 break;
                 case 3:
                     System.out.println(" Size : "+st.size());
                 break;
                 case 4:
                     System.out.println(" Peek "+st.peek());
                 break;
         }
         }
         while(choice!=5);
             
         
    }
    
}

