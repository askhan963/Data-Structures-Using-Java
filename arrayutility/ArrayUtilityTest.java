/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayutility;

/**
 *
 * @author AS KHAN
 */
public class ArrayUtilityTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      int [] Arr = {797,600,189,897,37};
 System.out.println(ArrayUtility.findMaximum(Arr,1, 4));
 System.out.println(ArrayUtility.findMaximumPosition(Arr, 1, 4));
        System.out.println(ArrayUtility.findMinimum(Arr, 1, 5));
                System.out.println(ArrayUtility.findMinimumPosition(Arr, 1, 5));
                ArrayUtility.swap(Arr, 1, 2);
    }
    
}
