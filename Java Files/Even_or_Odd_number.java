/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alexander
 */
import java.util.Scanner;
public class Even_or_Odd_number {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input1 = new Scanner(System.in);
       System.out.println("Please insert any number to see if it is even or odd");
    int i = input1.nextInt();

    if(i%2==0){
      System.out.println("It's an even Number "+"\n" + "The remanider is " + (i%2));
        } else{
      System.out.println("It's am an odd number " + "\n" + "The remanider is " + (i%2));
        }
    }
  
}