/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayRandomizer;

/**
 *
 * @author AS KHAN
 */
public class ArrayTest {
    public static void main(String[] args) {
                Array a = new Array(5);
//        a.arr[0]=23;
//        a.arr[1]=23;
//        a.arr[2]=23;
a.push(22);
a.push(33);

a.push(44);

a.push(55);
a.push(99);
                a.push(12);
     //   System.out.println(" BVc"+a.arr[3]);
     //   System.out.println(a.randomNum());
System.out.println("Size = "+a.sizeOfElements());
        a.print();
        a.pop();
        a.pop();
        a.push(12);
        a.print();
        System.out.println("Size = "+a.sizeOfElements());
        a.pop();
        a.pop();
        a.pop();
        a.pop();
        a.print();
        a.pop();
    }
    
}
