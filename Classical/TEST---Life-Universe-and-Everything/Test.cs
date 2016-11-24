using System;

public class Test {

	public static void Main () {
		
		while(true) {
			
			int i = int.Parse(Console.ReadLine());
			if (i == 42)
				break;
			System.Console.WriteLine(i);
			
		}
	}
}
