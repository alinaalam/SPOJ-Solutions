Problem: Given two natural numbers (both not greater than 200), each number in the separate line, please print the sum of them.

Side Note:
This is the solution to Test1 problem in Basic problem set. I would like to point out how I struggled initially when I
tried submitting the code. My code was written in Java:

        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.util.*;
 
        class Main
        {
	        public static void main (String[] args) throws java.lang.Exception
	        {
		        try {
		
		          Random random = new Random();
		
		          //get two random functions
		          int x = random.nextInt(200);
		          int y = random.nextInt (200);

		          System.out.println("First Number: " + x);
		          System.out.println("Second Number: " + y);
		          if (x < 200 && y < 200)
			          System.out.println(x+y);
		         } catch (Throwable trh) {
			        System.out.println("NumberFormatException" + trh.toString());
		        }
	        }
        }
        
The above program is logically doing the same thing, but because of the two print statements in the end, it was giving me an
error.

Bottom line: Write to-the-point code
