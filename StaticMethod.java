/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AS KHAN
 */
public class StaticMethod {
private int a;
private static int b;
//No argument constructor
public StaticMethod () {
for (int i=1;i<=5; i++) {
b=b+1;
a=b;
}
}
public static void showInfo(StaticMethod obj) {
System.out.printf("Object: %d\t%d\n", obj.a,b);
}

       public static void main(String [] args){
StaticMethod obj = new StaticMethod();
showInfo(obj);
StaticMethod obj1 = new StaticMethod();
showInfo(obj1);
}
}