//#include <stdio.h>
//int main(){
//
//	while (true){
//
//		int n;
//		int d[1000] = {0,};
//		int count = 0;
//		bool ans = false;
//		scanf("%d", &n);
//		if (n == -1){
//			break;
//		}
//
//		for (int j = 1; j <= n / 2; j++){
//			if (n % j == 0){
//				d[count] = j;
//				count++;
//			}
//		}
//
//		int d_sum = 0;
//		for (int j = 0; j < count; j++){
//			d_sum += d[j];
//		}
//
//		if (d_sum == n){
//			ans = true;
//		}
//
//		if (ans){
//			printf("%d = ", n);
//			for (int j = 0; j < count; j++){
//				if (j == count - 1){
//					printf("%d\n", d[j]);
//					break;
//				}
//				printf("%d + ", d[j]);
//
//			}
//		}
//		else{
//			printf("%d is NOT perfect.\n", n);
//		}
//	}
//	
//	return 0;
//}