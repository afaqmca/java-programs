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
public class VotingAge {
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age=");
        age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("You are eligible for vote.");
        }
        else
        {
            System.out.println("You are not eligible for vote.");
        }
    }
}
