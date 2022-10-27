/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Alexander
 */
public class Determining_Max_and_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    int[] arr = new int[] {20, 50, 25,  30, 10}; 

    int Max = arr[0];

    for (int i = 1;i <  arr.length; i++) {

      if( arr[i]> Max){ 
        Max=  arr[i];
      }
      
      System.out.println("maximum value " + Max);
  }
  }
}

    
 