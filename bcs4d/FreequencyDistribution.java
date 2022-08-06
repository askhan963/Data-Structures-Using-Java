/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bcs4d;

import java.util.Arrays;

/**
 *
 * @author AS KHAN
 */
public class FreequencyDistribution {
    public static void main(String[] args) {
        int [] data ={106,107,76,82,109,111,92,86,70,126,100,186,84,99,113,
            98,110,78,185,162,148,90,107,181,131,107,115,93,
        187,95,123,125,88,130,129,139,119,115,125,204,
        111,141,136,123,115,176,140,152,173,68,
        146,158,194,75,184,104,110,80,118,82};
         int range=0;
                int max=0;
                int min=0;
                int n=0;
                double k=0;
                double width;
        System.out.println("--------");
        for(int e : data){
            System.out.print(e+",");
        }
        System.out.println("");
        Arrays.sort(data);
        System.out.println("-----Sorted Array ----");
                for(int e : data){
            System.out.print(e+",");
        }
                System.out.println("");
               max = data[data.length-1];
               min = data[0];
               range = max - min;
               System.out.println("Range is : "+max+" - "+min +" = "+ range);
               System.out.println("");
               n = data.length;
               System.out.println(n);
                k =Math.log10(n);
               k = 1+3.3*k;
               System.out.println(k);
               k = Math.round(k);
               System.out.println(" Class Number is : "+k);
               width = range/k;
               width = Math.round(width);
               System.out.println("Width is : "+width);
               System.out.println("");
               String [] sortedData = new String[data.length];
               for (int i = 0; i < data.length; i++) {
            sortedData[i] = String.valueOf(data[i]);
        }
            
//               for (int i = 0; i < data.length; i++) {
//            String a [] = 
//        }
//           String stdata = Arrays
//           System.out.println(stdata);
//           System.out.println("");
//           System.out.println(stdata.length());
//           int w = (int)width;
//           w+=1;
//        for (int i = 0; i < data.length; i++) {
//            String a = stdata.substring(i, i+w);
//            System.out.println(a);
//            System.out.println("");
//            i = i+w;
//        }
               
    }
   
}
