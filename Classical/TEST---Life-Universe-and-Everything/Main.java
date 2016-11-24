import java.lang.*;
import java.util.*;

public class Main {
	public static void main (String[] args) {
		
		Scanner reader = new Scanner (System.in);
		
		while ( true) {
			//enter number
			int number = Integer.parseInt(reader.nextLine());
			if (number == 42)
				break;
			else
				System.out.println(number);
		} 
	}
}
