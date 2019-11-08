/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package efaculty.java.simple;

/**
 *
 * @author AFAQ
 * Swapping the numbers, if x is 10 and y is 20 them it will interchange with each other.
 * It means x would be 20 and y would be 10.
 */
public class JavaSwap {
    public static void main(String[] args) {
        // TODO code application logic here
        int a=10, b=20, temp;
        System.out.println("Before swapping");
        System.out.println("value of a="+a);
        System.out.println("value of b="+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping");
        System.out.println("value of a="+a);
        System.out.println("value of b="+b);
    }
}
