using System;

class Test1 {

	public static void Main () {
		int x , y = 0;
		x = Console.Read();
		y = Console.Read();

		if (x < 200 && y < 200)
			System.Console.WriteLine(x+y);
	}
}
