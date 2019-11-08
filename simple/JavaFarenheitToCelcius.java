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
public class JavaFarenheitToCelcius {
    public static void main(String[] args) {
        // TODO code application logic here
        float c,f;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Fahrenhiet=");
        
        f=sc.nextFloat();
        c=((f-32)*5)/9;
        System.out.println("Celcius="+c);
    }
}
