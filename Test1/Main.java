import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner reader = new Scanner(System.in);
		
		int x = reader.nextInt();
		int y = reader.nextInt();

		if (x < 200 && y < 200)
			System.out.println(x+y);
		/*try {
		
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
		}*/
	}
}
