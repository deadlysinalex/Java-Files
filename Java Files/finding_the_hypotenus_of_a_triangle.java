/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java_swing;

/**
 *
 * @author Alexander
 */
import java.util.Scanner;
import static java.lang.Math.sqrt;
public class finding_the_hypotenus_of_a_triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input1 = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    System.out.println("to Calculate the Hyponenus you need to insert the base and the height");
    System.out.println("Please insert the base");
    double b = input1.nextDouble();
    System.out.println("Please instert the height");
    double h = input2.nextDouble();
    
    System.out.println("the hypotenus of the triangle is "+ Math.sqrt((b*b)+(h*h)));
    
    
    
    }
    
}
