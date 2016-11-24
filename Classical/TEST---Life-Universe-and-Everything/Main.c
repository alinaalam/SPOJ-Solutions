#include<stdio.h>

int main (void) {
	
	while (1) {
		int i;
		scanf("%i", &i);
		if (i == 42) {
			break;
		}
		else
			printf("%i\n",i);
	}
	return 0;
}
