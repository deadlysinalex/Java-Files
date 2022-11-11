/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.java_swing;

/**
 *
 * @author Alexander
 */
public class Algorithims {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    /*int[] arr;
    arr =new int[6];
   
    for(int i = 0;i<6;i++){
    System.out.println("arr = " + i);
    }*/
    int[] arr = {0, 1, 2, 3, 4,5};
    
    int sum = 0;
    
    for(int i = 0;i< arr.length; i++) {
    System.out.println(arr[i]);
    sum = sum + arr[i];
    }
    

    System.out.println("sum of all the elements of and array: " + sum);
    
    }
}