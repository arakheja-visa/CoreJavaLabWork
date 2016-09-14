package day2;

import java.util.Scanner;

/**
 *
 * @author arakheja
 */
public class Lab1WhatDayIsIt {
     public static void main(String[] args) {
        String delims, resultDay = null;
        String[] date;
        int  a, b, c, d, result, mm, dd, yy;
        boolean timeToQuit = false;
        System.out.print("Please enter the date in MM-DD-YYYY format or to stop enter 'quit' ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        timeToQuit = "quit".equalsIgnoreCase(input);
        while(!timeToQuit)
        {
            //parsing string to get month, date, year
            delims = "[-]";
            date = input.split(delims);
            mm = Integer.parseInt(date[0]);
            dd = Integer.parseInt(date[1]);
            yy = Integer.parseInt(date[2]);

            if (mm > 0 && mm <3 ) 
            {
                mm += 12;
                yy -= 1;
            }
            a = (int)(13 * (mm +1)/5);
            b = (int)(yy/4);
            c = (int)(6* (yy/100));
            d = (int)(yy/400);
            result = (a+b+c+d+yy+dd)%7;
            switch(result){
                case 0: resultDay = "Saturday";
                break;
                case 1: resultDay = "Sunday";
                break;
                case 2: resultDay = "Monday";
                break;
                case 3: resultDay = "Tuesday";
                break;
                case 4: resultDay = "Wednesday";
                break;
                case 5: resultDay = "Thursday";
                break;
                case 6: resultDay = "Friday";
                break;
            }
            System.out.println(resultDay);
            System.out.print("Please enter the date in MM-DD-YYYY format or to stop enter 'quit' ");
            input = sc.next();
            timeToQuit = "quit".equalsIgnoreCase(input);
        }   
         
     }
}
