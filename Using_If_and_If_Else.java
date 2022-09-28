/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Alexander
 */
public class Using_If_and_If_Else {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        // TODO code application logic here
        //Nested if
        int i = 10;
        
        if (i == 10 || i<10) {
        System.out.println("i is smaller than 15");   
        if (i<12)
        System.out.println("i is smaller than 12 too");
        } else{
            System.out.println("i is greater than 15");
        }
        // using if-else-if ladders
        
        int score = 60;
        
        if (score == 100){
            System.out.println("Score is 100");
            System.out.println("Amazing job");
        }
        if (score == 90){
            System.out.println("score is 90%");
            System.out.println("Great Job");
       }
        else if(score == 80){
            System.out.println("Score is 80%");
            System.out.println("Good Job");
        }
        else if(score == 70)
        {
            System.out.println("Score is 70%");
            System.out.println("Better Luck Next Time");
        }
        else if(score == 60){
            System.out.println("Score is 60%");   
            System.out.println("Better Luck Next Time");
        }
        else if (score < 50){
            System.out.println("Better Luck Next Time");
        }
        
        
    }
}


