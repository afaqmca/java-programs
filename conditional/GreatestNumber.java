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
public class GreatestNumber 
{

    public static void main(String[] args) 
    {
        int n1, n2, n3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1 number=");
        n1 = sc.nextInt();
        System.out.print("Enter n2 number=");
        n2 = sc.nextInt();
        System.out.print("Enter n3 number=");
        n3 = sc.nextInt();
        if (n1 > n2) 
        {
            if (n1 > n3) 
            {
                System.out.println("n1 is greatest.");
            } 
            else 
            {
                System.out.println("n3 is greatest.");
            }
        } 
        else 
        {
            if (n2 > n3) 
            {
                System.out.println("n2 is greatest.");
            } 
            else 
            {
                System.out.println("n3 is greatest.");
            }
        }
    }
}
