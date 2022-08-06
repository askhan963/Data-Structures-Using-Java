package arrayutility;

/**
 *
 * @author AS KHAN
 */
public class ArrayUtility {
    // 1. Returns the maximum value occurring in the array Arr between position i and j.
    public static int findMaximum(int[] Arr, int i, int j){
     
       // i cannot be less that 1 bcz its possiton , j must be less or equal to array length
        if(i<1 || i>j || j>Arr.length){
      System.out.println("1st position must be less or equal to 2nd possition,\n1st possition must be > 0, \n2nd postion must be less or equal to Array length");
            //is case of i>j,i<1 and j>length we will return -ve value 
            return -9999;
        }
        else {
               //i, and j are possition we decrement in both to access indexes.
            i--;
            j--;
            //we initialize maxnumber with start possition 
           int maximumNum =Arr[i];
             for (int k = i; k <= j; k++) {
                if(Arr[k]>maximumNum ){
                   maximumNum =Arr[k]; 
                }
            }
             return maximumNum;
        }
    }

//2. Returns the position of the maximum value in the array Arr between position i and j.
    public static int findMaximumPosition(int[] Arr, int i, int j){
         // i cannot be less that 1 bcz its possiton , j must be less or equal to array length
        if(i<1 || i>j || j>Arr.length){
      System.out.println("1st position must be less or equal to 2nd possition,\n1st possition must be > 0, \n2nd postion must be less or equal to Array length");
            //is case of i>j,i<1 and j>length we will return -ve value 
            return -9999;
        }
        else {
               //i, and j are possition we decrement in both to access indexes.
            i--;
            j--;
           int maximumNum =Arr[i];
           //we initialize index with start possition 
           int index=i;
             for (int k = i; k <= j; k++) {
                 //incase of two nuumber are same at different location we will assume 2nd as our intrest
                if(Arr[k]>=maximumNum ){
                   maximumNum =Arr[k]; 
                   index=k;
                }
            }
             //return index +1 bcz we need possition
             return index+1;
        }
    }
//3. Returns the minmum value occurring in the array Arr between position i and j.
    public static int findMinimum(int[] Arr, int i, int j){
        // i cannot be less that 1 bcz its possiton , j must be less or equal to array length
        if(i<1 || i>j || j>Arr.length){
      System.out.println("1st position must be less or equal to 2nd possition,\n1st possition must be > 0, \n2nd postion must be less or equal to Array length");
            //is case of i>j,i<1 and j>length we will return -ve value 
            return -9999;
        }
        else {
               //i, and j are possition we decrement in both to access indexes.
            i--;
            j--;
            //we initialize Minimum number with start possition 
           int minimumNum =Arr[i];
             for (int k = i; k <= j; k++) {
                if(Arr[k]<minimumNum ){
                   minimumNum =Arr[k]; 
                }
            }
             return minimumNum;
        }
    }
//4. Returns the position of the minimum value in the array Arr between position i and j.
    public static int findMinimumPosition(int[] Arr, int i, int j){
         // i cannot be less that 1 bcz its possiton , j must be less or equal to array length
        if(i<1 || i>j || j>Arr.length){
      System.out.println("1st position must be less or equal to 2nd possition,\n1st possition must be > 0, \n2nd postion must be less or equal to Array length");
            //is case of i>j,i<1 and j>length we will return -ve value 
            return -9999;
        }
        else {
               //i, and j are possition we decrement in both to access indexes.
            i--;
            j--;
           int minimumNum =Arr[i];
           //we initialize index with start possition 
           int index=i;
             for (int k = i; k <= j; k++) {
                 //in case of two nuumber are same at different location we will assume 2nd as our intrest
                if(Arr[k]<=minimumNum ){
                   minimumNum =Arr[k]; 
                   index=k;
                }
            }
             //return index +1 bcz we need possition
             return index+1;
        }
    }
//5. Swaps the elements in position i and j in the array Arr
    public static void swap(int[] Arr, int i, int j){
                 // i cannot be less that 1 bcz its possiton , j must be less or equal to array length
        if(i<1 || i>=j || j>Arr.length){
              //is case of i>j,i<1 and j>length we will return -ve value 
      System.out.println("1st position must be less or greater 2nd possition,\n1st possition must be > 0, \n2nd postion must be less or equal to Array length");
        }
        else{
            i--;
            j--;
            System.out.println("---Before Swap ---");
            for (int k = 0; k < Arr.length; k++) {
                System.out.print(Arr[k]+" ,");
            }
            System.out.println("");
            int temp=Arr[i];
            Arr[i]=Arr[j];
            Arr[j]=temp;
            System.out.println("---After Swap ---");
            for (int k = 0; k < Arr.length; k++) {
                System.out.print(Arr[k]+" ,");
            }
            System.out.println("");
        }
    }
}
