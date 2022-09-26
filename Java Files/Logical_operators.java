/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Alexander
 */
public class Logical_operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        // (5 > 3) && (8 > 5) reutrns as true because both exprestions are true
       
        int a = 3, b = 7, c = 12, d = 9;
        
        System.out.println( (d > b) && (c > a));
        System.out.println( (a > b) || (c > d));
        System.out.println( !(a > c) == (b > c));
    }
}
