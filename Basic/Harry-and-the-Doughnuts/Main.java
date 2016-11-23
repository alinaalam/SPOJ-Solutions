import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner reader = new Scanner(System.in);
		int t,c,k,w = 0;

		t = reader.nextInt();
		while (t > 0) {
			c = reader.nextInt();
			k = reader.nextInt();
			w = reader.nextInt();

			if (c*w <= k)
				System.out.println("yes");
			else
				System.out.println("no");
			t--;
		}	
	}
}
