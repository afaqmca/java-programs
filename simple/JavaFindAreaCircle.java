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
public class JavaFindAreaCircle {
    public static void main(String[] args) {
        // TODO code application logic here
        float area,pi,r;
        pi=(float)22/7;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius=");
        r=sc.nextFloat();
        area=(float)pi*r*r;        
        System.out.println("Area of Rectangle="+area);
    }
}
