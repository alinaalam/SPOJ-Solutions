#include <iostream>

using namespace std;

int main() {

	int x, y = 0;
	cin >> x;
	cin >> y;

	if (x < 200 && y < 200)
		cout << x + y;
	return 0;
}
