package Hackerank;

import java.io.*;
import java.util.Stack;

public class InfixToPostfix {
    static Stack<String> stack = new Stack<>();
    
    public static void main(String argv[]) throws IOException {
        String infix;
//create an input stream object
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
//get input from user
        System.out.print("\nEnter the infix expression you want to convert: ");
        infix = keyboard.readLine();
//output as postfix
        System.out.println("Postfix expression for the given infix expression is:" + toPostfix(infix));
    }
    
    private static String toPostfix(String infix)
    {
        
        String postfix = "";
//        for (int i = 0; i < infix.length(); ++i) {
//            String index = String.valueOf(infix.charAt(i));
//            if (isNumber(index)) {
//                postfix.concat(index);
//            } else {
//                if (stack.empty()) {
//                    stack.push(index);
//                } else {
//                    if (stack.get(stack.size()).equals("(")) {
//                        stack.push(index);
//                    } else
//                }
//            }
//            if (index.equals("(")) {
//
//            }
//            if (index.equals(")")) {
//
//            }
//        }
        
        return postfix;
    }
     static boolean isNumber(String a) {
        try {
            Integer n = Integer.parseInt(a);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    static Integer precedence(String c){
        switch (c){
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            case "^":
                return 3;
        }
        return -1;
    }
    
}
