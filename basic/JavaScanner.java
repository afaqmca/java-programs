/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package efaculty.java.basic;

import java.util.Scanner;

/**
 *
 * @author AFAQ
 */
public class JavaScanner {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a number=");
        int num=sc.nextInt();
        System.out.println("The number is "+num);
        
        System.out.print("Enter a char=");
        char ch=sc.next().charAt(0);
        System.out.println("The char is "+ch);
        
        System.out.print("Enter a number with decimal=");
        float f=sc.nextFloat();
        System.out.println("The number with decimal is "+f);
        
        System.out.print("Enter your name=");
        String name=sc.next();
        System.out.println("How are you "+name);
    }
}
