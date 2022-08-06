/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author AS KHAN
 */
public class LL {
    Node start = null;
    //insertion at first
    public void insertFirst(int value){
          Node n = new Node();
        if(start==null){
            n.data=value;
            n.next=null; //=start
            start=n;
        }
        else{
            n.data=value;
        n.next=start;
        start=n;
        }
    }
    //insertion at last
    public void insertLast(int value){
        Node n = new Node();
        if(start==null){
            n.data=value;
            n.next=null; //=start
            start=n;
        }
        else
        {
            n.data=value;
            n.next=null;
            Node currNode = start;
           while(currNode.next !=null){
               currNode = currNode.next;
           }
          currNode.next=n;
        }
    }
    //printing linked list
    public void print(){
        if(start==null){
            System.out.println("List is  Empaty");
        }
            Node currNode = start;
           while(currNode !=null){
               System.out.print(currNode.data+" --> ");
               currNode = currNode.next;
               
           }
           
    }
//    public int linearSearch(int key){
//        int position=0;
//        Node n1 = start;
//        while(n1 !=null){
//            if(n1.data==key){
//                position=position;
//            }
//            else {
//                position++;
//            }
//            n1=n1.next;
//        }
//        return position++;
//    }
    //deletion at first
    public int deleteFirst(){
       
        Node n = start;
        if(start !=null){
       int val =n.data;
        start =n.next;
        return val;
                }
        else{
           // System.out.println("List is Emapty");
            return 999;
        }
        
    }
    //deletion at last
    public int deleteLast(){
        Node curr=start;
        Node prev=null;
        if(start==null){
            return 999;
        }
        else{
            while(curr.next != null){
                prev=curr;
                curr= curr.next;
            }
            int val = curr.data;
            prev.next=null;
            return val;
        }
    }
//length of linked List
    public int length(){
        int length=0;
        Node n2=start;
        while(n2 != null){
            length++;
            n2 = n2.next;
        }
        return length;
    }
    //insertion after a key
    public void insertionAfter(int key,int value){
        Node curr=start;
        while(curr !=null){
            if(curr.data==key)
                break;
            curr= curr.next;
        }
        Node next= new Node();
        next.data=value;
              next.next = curr.next;
        curr.next=next;
        
    }
    //deletion after a key
    public void deleteAfter(int key){
                Node curr=start;
                Node prev=null;
                if(start==null){
                    System.out.println("List empaty");
                }
                else{
        while(curr !=null){
            if(curr.data==key){
                prev=curr;
            curr= curr.next;
               break;
            }
            prev=curr;
            curr= curr.next;
             
            
        }
        
        prev.next=curr.next;
                }
    }
    
}
