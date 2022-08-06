/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

/**
 *
 * @author AS KHAN
 */
public class StactArray<T> {
    T[] arr;
int top=-1;
public StactArray(){
    arr =(T[]) new Object[100];
}
    public StactArray(int num) {
          arr =(T[]) new Object[num];
    }
    private boolean isFull(){
        if(top >= arr.length -1)
            return true;
        else
            return false;
    }
         boolean isEmpty(){
        if(top <=  -1)
            return true;
        else
            return false;
    }
        public void push(T value){
            if(isFull()){
                System.out.println("Stack Overflow");
            }
            else {
                top++;
                arr[top]=value;
            }
        }
        public T pop(){
            if (isEmpty()) {
          
                System.out.println(" Stack underflow.");
                return null;
            }
            else {
            T val= arr[top];
            top--;
            return val;
            }
        }
        public int size(){
            return top+1;
        }
        public T peek(){
            if(isEmpty()){
                return null;
            }
            else{
                T val = arr[top];
                return val;
            }
        }
 
}
