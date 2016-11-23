#include<stdio.h>

int main(void) {

	//get no. of tries
	int t, c, k, w = 0;
	scanf("%i", &t);

	while (t > 0) {
		
		//get no. of cats
		scanf("%i", &c);
		//get no. of kgs
		scanf("%i", &k);
		//get weight
		scanf("%i", &w);

		if (c*w <= k)
			puts("yes");
		else
			puts("no");
		t--;
	}

	return 0;
}
