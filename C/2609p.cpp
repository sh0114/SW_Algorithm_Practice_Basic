//#include <stdio.h>
//
//int main(){
//
//	int a, b, mul, temp;
//	int lcm = 0, gcd = 0;
//
//	scanf("%d %d", &a, &b);
//	mul = a * b;
//	
//	while (b > 0){
//		temp = a % b;
//		a = b;
//		b = temp;
//	}
//
//	gcd = a;
//
//	lcm = mul / gcd;
//
//	printf("%d\n", gcd);
//	printf("%d", lcm);
//
//	return 0;
//}