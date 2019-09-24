#include <stdio.h>
int main(){
	int tc;
	scanf("%d", &tc);
	for (int i = 0; i < tc; i++){
		int k;
		int ans = 1; 
		scanf("%d", &k);
		for (int j = 0; j < k; j++){
			ans *= 2;
		}
		printf("%d\n", ans - 1);
	}
	return 0;
}