/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package randomizerarray;

/**
 *
 * @author AS KHAN
 */
public class Randomizer<T> {
   private T arr[];
  private  int num=0;
  private  int size=0;
  public  Randomizer(int n){
      arr = (T[]) new Object[n];
      num = n;
      
  }
  //printing method of the array
  public void print(){
      System.out.println("--- Array Elements ---: ");
      for (int i = 0; i < arr.length; i++) {
          System.out.print(" "+arr[i]);
      }
      System.out.println("\n---       ----");
  }
  //method to check wheather array is full
 public boolean isFull(){
      if(size >=num)
          return true;
      else 
          return false;
  }
    //method to check wheather array is empty
  public boolean isEmpty(){
      if(size==0)
          return true;
      else
          return false;
      
  }
  //insertion method in array
  public void insert(T value){
      //to generate random index calling method
      int index = randomNum();
   //if index is null then place new value 
       if(arr[index] == null){
           arr[index] =value;
           size++;
      }
       //check if array is not full that cal function itself
       else if(!isFull()){
           insert(value);
      }
       //if array is full
       else{
           System.out.println(" Array is full. ");
       }
  }
  //randomly deleting method
  public T delete(){
      //to generate random index calling method
      int index = randomNum();
   T val = null;
   //check if array is not empty if true than check that at index there no element present
    if(!isEmpty()){
       if(arr[index] != null){
           //return indexes value
           val=arr[index];
           //replace index value with null
           arr[index] = null;
           //decrement in size
           size--;
           //return val;
      }
       //if there is element present at index method call itself
       else{
                      delete();
       }
    }
    //if array is empty
    else {
           System.out.println(" Array is Empty. ");
    }
       return val;
  }
  //size method for array present elements
  public int size(){
      return size;
  }
  //method that generates radom indexes b/w 0 and array length
  private int randomNum(){
      return (int) (Math.random()*(num));
  }
}
