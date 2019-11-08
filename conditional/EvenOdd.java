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
public class EvenOdd {
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number=");
        number=sc.nextInt();
        if(number%2==0)
        {
            System.out.println("Number is even.");
        }
        else
        {
            System.out.println("Number is odd.");
        }
    }
}
