/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package randomarray;

/**
 *
 * @author AS KHAN
 */
public class Array {
int size=0;
int arr[];
Array(int n){
    arr = new int[n];
}

public void print(){
    for (int i = 0; i < arr.length; i++) {
        System.out.print(" "+arr[i]);
    }
}
}
