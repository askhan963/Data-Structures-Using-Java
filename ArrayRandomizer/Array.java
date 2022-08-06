/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayRandomizer;

/**
 *
 * @author AS KHAN
 */
public class Array {
int size=0;
int num=0;
int arr[];
Array(int n){
    num = n;
    arr = new int[n];
}
public void push(int value){
    int n = randomNum();
    boolean flag = false;
    for (int i = 0; i < arr.length; i++) {
        if(arr[n]==0 )
            flag = true;
    }
    if(flag){
        arr[n]=value;
        size++;
    }
    else if(!isFill()){
        
        push(value);
    }
    else {
        System.out.println(" Array is filled.");
    }
}
public void print(){
    for (int i = 0; i < arr.length; i++) {
        System.out.print(" "+arr[i]);
    }
    System.out.println("");
}
public int randomNum(){
    return (int) (Math.random()*(num));
}
public boolean isFill(){
    if(size==num)
        return true;
    else 
        return false;
}
public boolean isEmpty(){
    if(size==0)
        return true;
    else 
        return false;
}
public void pop(){
     int n = randomNum();
    boolean flag = false;
    for (int i = 0; i < arr.length; i++) {
        if(arr[n]!=0 )
            flag = true;
    }
    if(flag){
        arr[n]=0;
        size--;
    }
    else if(!isEmpty()){
        pop();
    }
    else{
        System.out.println(" Noting to Delete.");
    }
}
public int sizeOfElements(){
    return size;
}
}