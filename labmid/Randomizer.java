/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labmid;

/**
 *
 * @author AS KHAN
 */
public class Randomizer {
int []  arr;
int size=0;
int num=0;

    public Randomizer(int size) {
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=-9999;
        }
        num = size;
    }
    public boolean isFull(){
        if(size>=arr.length){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        else{
            return false;
        }
    }
public void insert(int value){
 int index = randomIndex();
 if(value>0){
     
 if(!isFull() && arr[index]==-9999){
   arr[index]=value;
   size++;
    
 }
 else{
     insert(value);
 }
 }
 else{
     System.out.println("");
     System.out.println("Please enter +ve Value.");
 }
}
public int delete(){
    int val = 0;
     int index = randomIndex();
     if(!isEmpty()&& arr[index]!=-9999){
         val = arr[index];
         arr[index]=-9999;
         size--;
       
        
     }
     else{
         delete();
        
     }
   return val;
}
public int randomIndex(){
    return (int)(Math.random()*(arr.length));
}
public void print(){
    for (int i = 0; i < arr.length; i++) {
        System.out.print(" "+arr[i]);
    }
    System.out.println("");
}
}
