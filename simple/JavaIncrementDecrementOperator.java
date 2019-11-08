/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package efaculty.java.simple;

/**
 *
 * @author AFAQ
 */
public class JavaIncrementDecrementOperator {
    public static void main(String[] args) {
        // TODO code application logic here
        int i=10,j=10,num=0;
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("num="+num);
        System.out.println("---------------------------------------");
        i++;
        j--;
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("num="+num);
        System.out.println("---------------------------------------");
        num=i++;
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("num="+num);
        System.out.println("---------------------------------------");
        num=i++ + ++i;
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("num="+num);
        System.out.println("---------------------------------------");
        num=i++ + --j;
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("num="+num);
        System.out.println("---------------------------------------");
        num=--i + j++;
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("num="+num);
        System.out.println("---------------------------------------");
        num=++i + ++j;
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("num="+num);
        
        
    }
}
