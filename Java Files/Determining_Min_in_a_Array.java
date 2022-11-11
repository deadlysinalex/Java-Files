/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alexander
 */
public class Determining_Min_in_a_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             int[] arr = new int[] {20, 50, 25,  30, 10}; 

    int Min = arr[0];

    for (int i = 1;i <  arr.length; i++) {

      if( arr[i]< Min){ 
        Min=  arr[i];
      }
      


      System.out.println("The Mininmum value is " + Min);
    
  }
  }
}
