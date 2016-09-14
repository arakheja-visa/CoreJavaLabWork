/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

import java.util.Scanner;

/**
 *
 * @author arakheja
 */
public class Lab2DataAnalysis {
    
    public static void main(String[] args) {
        
        System.out.print("Please enter the number of items you want to provide: ");
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] array = new int[sizeOfArray];
         
        for(int i = 0; i<array.length; i++){
            System.out.println("Please enter the " +(i+1)+ " number" );   
            array[i]=sc.nextInt();
        }
        int min = array[0];
        int max = array[0];
        int sum =0;
        double mean = 0;
        for(int i = 0; i<array.length; i++){
            if(min > array[i] ){
            min = array[i];
            }
            if(max < array[i] ){
            max = array[i];
            }
            sum = sum + array[i];
            
        }
        mean = (double)sum/sizeOfArray;
        System.out.println ("Smallest number added: " +min + ", Largest number added: " + max + " and Mean : " + mean);
    }
        
    
}
