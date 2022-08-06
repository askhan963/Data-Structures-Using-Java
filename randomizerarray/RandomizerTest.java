
package randomizerarray;

import java.util.Scanner;

/**
 *
 * @author AS KHAN
 */
public class RandomizerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Abc khan");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        Randomizer<Integer> a = new Randomizer<>(in.nextInt());

         int choice=0;
         do{
         System.out.println("--------"); 
         System.out.println("1. Insert  ");
         System.out.println("2. Delete ");
         System.out.println("3. Size ");
         System.out.println("4. Print ");
         System.out.println("5. Is full? ");
         System.out.println("6. Is Empty? ");
         System.out.println("7. Quit ");
         System.out.println("--------");
         System.out.println("Select : ");
         choice=in.nextInt();
         switch(choice){
             case 1:
                 System.out.println("Enter value: ");
                 a.insert(in.nextInt());
                 break;
                 case 2:
                     System.out.println(" Pop "+a.delete());
                 break;
                 case 3:
                     System.out.println(" Size : "+a.size());
                 break;
                 case 4:
                     a.print();
                 break;
                 case 5:
                     System.out.println(" Is Aaray full? "+a.isFull());
                     break;
                 case 6:
                     System.out.println("Is Array Empty? "+a.isEmpty());
                     break;
                 case 7:
                     System.out.println("Terminated SecessFully");
                     System.exit(0);
                 default:
                     System.out.println("Invalid choice Try Again! ");
                     break;
                     
         }
         }
         while(choice!=7);
    }
    
}
