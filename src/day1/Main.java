package day1;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arakheja
 */
public class Main { 
    
 double f =0;
    public static void main(String[] args) {
        System.out.print("Please enter the temperature in Fahrenhite..");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        double f = Double.valueOf(input);
       double c = 5 * (f-32)/9;
        System.err.print("Value in Celsius: " +c); 
    }
}
