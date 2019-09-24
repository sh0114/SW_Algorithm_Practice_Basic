#include <stdio.h>

int main(){
	long long int n;
	scanf("%lld", &n);

	long long int result = 0;
	long long int checkpoint = 0;

	for (int i = 1; i <= n; i++){
		if (n % i == 0){
			result += n / i;
			checkpoint = i;
		}
		else if (i > n / 2){
			result += 2;
		}
		else{
			result += n / checkpoint;
		}

	}

	printf("%lld", result);
	return 0;
}