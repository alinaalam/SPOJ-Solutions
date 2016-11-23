#include <iostream>
#include<cstdio>
using namespace std;

int main () {

	 // insert code here...
    int t, c, k, w;
    cin >> t;
    while (t) {
        cin >> c;
        cin >> k;
        cin >> w;
        if (c*w <= k) {
            puts("yes");
        }else {
            puts("no");
        }
        t--;
    }
    return 0;
}
