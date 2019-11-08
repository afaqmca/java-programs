/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package efaculty.java.conditional;

import java.util.Scanner;

/**
 *
 * @author AFAQ
 */
public class GreaterNumber {
    public static void main(String[] args) {
        int n1,n2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n1 number=");
        n1=sc.nextInt();
        System.out.print("Enter n2 number=");
        n2=sc.nextInt();
        if(n1<n2)
        {
            System.out.println("n2 is greater than n1.");
        }
        else
        {
            System.out.println("n1 is greater than n2.");
        }
    }
}
