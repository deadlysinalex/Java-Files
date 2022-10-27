/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alexander
 */
import java.util.Scanner;
public class Mark_Test {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.println("Please insert test precentage");
    int num1 =  input.nextInt();
    if(num1>=90){
        System.out.println("Fantastic work!");
    } else if(num1>=80) {
    System.out.println("Great Job!");
    } else if(num1>=70){
    System.out.println("Good Job! Needs some improvement though");
    } else if(num1>=60){
    System.out.println("Okay job! Study more and you will get there!");
    } else if(num1>= 50){
    System.out.println("You Need to Study Harder and for longer periods of time!");
    } else if (num1<50);{
    System.out.println("Okay you failed this test. You have to do better.  Pay close Attention to what the teach is doing! Study more and do the homework given to you!!");
    }
    
    }
    
}
