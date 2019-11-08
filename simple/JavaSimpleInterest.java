/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package efaculty.java.simple;

import java.util.Scanner;

/**
 *
 * @author AFAQ
 */
public class JavaSimpleInterest {
    public static void main(String[] args) {
        // TODO code application logic here
        int p,r,t,si;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a amount=");
        p=sc.nextInt();
        System.out.print("Enter a rate=");
        r=sc.nextInt();
        System.out.print("Enter a time=");
        t=sc.nextInt();
        
        si=(p*r*t)/100;        
        System.out.println("Simple interest="+si);
    }
}
