package day2;

import java.util.Scanner;

/**
 *
 * @author arakheja
 */
public class Lab1 {
     public static void main(String[] args) {
        String delims;
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
            a = (int)(13 * ((mm +1)/5));
            b = (int)(yy/4);
            c = (int)(6*(int)(yy/100));
            d = (int)(yy/400);
            result = (a+b+c+d+yy+dd)%7;
            System.out.println(result);
            System.out.print("Please enter the date in MM-DD-YYYY format or to stop enter 'quit' ");
            input = sc.next();
            timeToQuit = "quit".equalsIgnoreCase(input);
        }   
         
     }
}
