using System;

class Test1 {

	public static void Main () {
		int x , y = 0;
		x = int.Parse(Console.ReadLine());
		y = int.Parse(Console.ReadLine());

		if (x < 200 && y < 200)
			System.Console.WriteLine(x+y);
	}
}
