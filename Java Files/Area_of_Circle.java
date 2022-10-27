/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alexander
 */
import java.util.Scanner;

public class Area_of_Circle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double pi = 3.14;
        Scanner input= new Scanner(System.in);
        System.out.println("please insert a radius");
        double r =  input.nextDouble();
        if (r<0){
        System.out.println("Negative Input.  Please Try Again Later");
        } else {
        System.out.println("the area of the circle is " + ((r*r)*pi));
        }
    }
    
}
