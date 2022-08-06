/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BST;

/**
 *
 * @author AS KHAN
 */
public class BST {
    class Node{
        int data;
        Node leftChild;
        Node rightChild;
    }
    Node root=null;
    public void insert(int value){
     
         root=   insertChild(root,value);
// else if(value >= root.data){
//            insertChild(root.rightChild,value);
//        }
//        else if( value<root.data){
//            insertChild(root.leftChild,value);
//        }
    }
    public Node insertChild(Node node,int value){
    
        if(node==null){
              Node n = new Node();
            n.data=value;
            return n;
       }
           if(value >= node.data){
           node.rightChild = insertChild(node.rightChild,value);
        }
        else if( value<node.data){
           node.leftChild= insertChild(node.leftChild,value);
        }
        return node;
    }
    public void inOrder(){
        inOrderTriversal(root);
    }
    public void inOrderTriversal(Node root){
        if(root==null){
            return;
        }
         inOrderTriversal(root.leftChild);
        System.out.print(""+root.data+" ");
         inOrderTriversal(root.rightChild);
        
    }
    public void sea(int key){
        
    }
    public Node search(Node root,int key){
      if(root.data==key){
          return root;
      }
        else  if(root.data > key){
            return search(root.rightChild,key);
        }
        else {
            return search(root.leftChild,key);
        }
    }
    public Node deleteNode(Node root,int key){
         Node n = search(root,key);
         if(n!=null){
             if(n.leftChild ==null && n.rightChild ==null){
                 
             }
             
         }
         else{
             return null;
         }
    }
    public int delete(int key){
       return key;
    }

}
