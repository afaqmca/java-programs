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
public class JavaFindAreaRectangle {
    public static void main(String[] args) {
        // TODO code application logic here
        int l,b,area;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length=");
        l=sc.nextInt();
        System.out.print("Enter bredth=");
        b=sc.nextInt();
        
        area=l*b;        
        System.out.println("Area of Rectangle="+area);
    }
}
