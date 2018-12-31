#include <stdio.h>

int main() {
	//code
	int seriesCount;
	int firstTerm;
	int secondTerm;
	int difference;
	int nthTerm;
	scanf("%d", &seriesCount);
	for(int i = 0; i < seriesCount; i++) {
	    scanf("%d %d", &firstTerm, &secondTerm);
	    difference = secondTerm - firstTerm;
	    scanf("%d", &nthTerm);
	    printf("%d\n", (firstTerm + (nthTerm - 1)*difference));
	}
	return 0;
}