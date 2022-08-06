/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

/**
 *
 * @author AS KHAN
 */

public class StackTest {
           public static int  checkOperater(char c){
            if(c=='^'){
                return 3;
            }
            else if(c=='+' || c=='-'){
                return 1;
            }
            else if(c=='*' || c=='/'){
                return 2;
            }
                
            else 
                return 0;
        }
      public static String infixToPrefix(String exp1){
          String preExp="";
          StringBuilder str = new StringBuilder(exp1);
          str=str.reverse();
          String exp = str.toString();
            StactArray <Character> st= new StactArray(exp.length());
    for (int i = 0; i < exp.length(); i++) {
        char c = exp.charAt(i);
        if(Character.isLetterOrDigit(c)){
            preExp+=c;
        }
        else if( c=='('){
            st.push(c);
        }
        else if(c==')'){
            while(!st.isEmpty() && st.peek()!='('){
               preExp+=st.pop();
             
            }
              if(st.peek()=='(')
                   st.pop();
        }
        else {
            while(!st.isEmpty() && checkOperater(c) < checkOperater(st.peek())){
                preExp+=st.pop();
              
            }
              st.push(c);
        }
    }
    while(!st.isEmpty())
        preExp+=st.pop();
          StringBuilder str2= new StringBuilder(preExp);
          str2 = str2.reverse();
          return str2.toString();
      }     
public static String infixToPostfix(String exp){
    String postExp="";
    
    StactArray <Character> st= new StactArray(exp.length());
    for (int i = 0; i < exp.length(); i++) {
        char c = exp.charAt(i);
        if(Character.isLetterOrDigit(c)){
            postExp+=c;
        }
        else if( c=='('){
            st.push(c);
        }
        else if(c==')'){
            while(!st.isEmpty() && st.peek()!='('){
               postExp+=st.pop();
             
            }
              if(st.peek()=='(')
                   st.pop();
        }
        else {
            while(!st.isEmpty() && checkOperater(c) < checkOperater(st.peek())){
                postExp+=st.pop();
              
            }
              st.push(c);
        }
    }
    while(!st.isEmpty())
        postExp+=st.pop();
    return postExp;
}
public static String postfixToPrefix(String exp){
    String prefixExp="";
    StactArray <String> st= new StactArray(exp.length());
    for (int i = 0; i < exp.length(); i++) {
        char c = exp.charAt(i);
        if(Character.isLetterOrDigit(c)){
            st.push(c+"");
        }
        else if(c =='+'){
                         String s1 = st.peek();
            st.pop();
            String s2= st.peek();
            st.pop();
            prefixExp=c+s1+s2;
            st.push(exp);
           
        }
        else if(c =='-'){
           
            String s1 = st.peek();
            st.pop();
            String s2= st.peek();
            st.pop();
            prefixExp=c+s1+s2;
            st.push(exp);
        }
        else if(c =='*'){
                     String s1 = st.peek();
            st.pop();
            String s2= st.peek();
            st.pop();
            prefixExp=c+s1+s2;
            st.push(exp);
        }
        else if(c =='/'){
                  String s1 = st.peek();
            st.pop();
            String s2= st.peek();
            st.pop();
            prefixExp=c+s1+s2;
            st.push(exp);
        }
    }
   
    return prefixExp;
}
 static boolean isOperator(char x)
    {
 
        switch (x) {
        case '+':
        case '-':
        case '/':
        case '*':
            return true;
        }
        return false;
    }
 
    // Convert postfix to Prefix expression
    static String postToPre(String post_exp)
    {
        StactArray <String> s= new StactArray<String>();
       // StackArray<String> s = new StackArray<String>();
 
        // length of expression
        int length = post_exp.length();
 
        // reading from right to left
        for (int i = 0; i < length; i++) {
 
            // check if symbol is operator
            if (isOperator(post_exp.charAt(i))) {
 
                // pop two operands from stack
                String op1 = s.peek();
                s.pop();
                String op2 = s.peek();
                s.pop();
 
                // concat the operands and operator
                String temp
                    = post_exp.charAt(i) + op2 + op1;
 
                // Push String temp back to stack
                s.push(temp);
            }
 
            // if symbol is an operand
            else {
 
                // push the operand to the stack
                s.push(post_exp.charAt(i) + "");
            }
        }
 
        // concatenate all strings in stack and return the
        // answer
        String ans = "";
        while(!s.isEmpty()){
            ans=s.peek();
            s.pop();
        }
        return ans;
    }
    public static double sol(double d1,double d2, char c){
        double d =0;
        switch(c){
            case '+':
                    d= d1+d2;
                    case '-':
                    d= d1-d2;
                    case '*':
                    d= d1*d2;
                    case '/':
                    d= d1/d2;
                    case '^':
                    d= Math.pow(d1, d2);
        }
               
        return d;
    }
    public static double prefixEva(String exp){
        StactArray <Double> st= new StactArray();
        for (int i = exp.length() -1 ; i >=0; i--) {
            char c = exp.charAt(i);
            if(Character.isDigit(c)){
                st.push((double)c-48);
            }
            else {
                double s1 = st.peek();
                st.pop();
                double s2 = st.peek();
                st.pop();
                switch(c){
            case '+':
                 st.push(s1+s2);
                 break;
                    case '-':
                     st.push(s1-s2);
                 break;
                    case '*':
                   st.push(s1*s2);
                 break;
                    case '/':
                  st.push(s1/s2);
                 break;
                    case '^':
                    st.push(Math.pow(s1, s2));
                 break;
        }
               
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
//        StactArray <Float> st= new StactArray(6);
//        st.pop();
//        st.push(4.4f);
//        System.out.println("Size "+st.size());
//        st.push(4.5f);
//        System.out.println("Top value "+st.peek());
//        st.push(5.4f);
//        st.push(4.6f);
//        st.push(4.9f);
//        st.pop();
//        System.out.println("Size "+st.size());
//                System.out.println("Top value "+st.peek());
//                System.out.println("");
//                st.push(1.2f);
//                st.push(11.1f);
                System.out.println(infixToPostfix("X*A-B"));
                System.out.println(infixToPrefix("X*A-B"));
                System.out.println("");
                //System.out.println(postfixToPrefix("ABC/-AK/L-*"));
                System.out.println("");
                System.out.println(postToPre("ABC/-AK/L-*"));
                System.out.println(prefixEva("+9*26"));
                
    }
}
