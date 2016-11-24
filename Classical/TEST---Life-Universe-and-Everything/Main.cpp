#include<iostream>

using namespace std;

int main(void) {
	
	while (1) {
		int i;
		cin >> i;
		if (i == 42)
			break;
		else
			cout << i << "\n"; 
	}
	return 0;
}
