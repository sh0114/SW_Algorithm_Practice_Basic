//#include <stdio.h>
//
//int main(){
//	int n;
//
//	scanf("%d", &n);
//
//	int cards[2100];
//	int count = 0;
//
//	for (int i = 0; i < n; i++){
//		cards[i] = i + 1;
//	}
//
//	while (cards[1] > 0){
//		printf("%d ", cards[0]);
//		int temp = cards[1];
//		for (int i = 2; i < n - count; i++){
//			cards[i - 2] = cards[i];
//		}
//		cards[n - count-2] = temp;
//
//		for (int i = 0; i <= count; i++){
//			cards[n - 1 - i] = -1;
//		}
//		count++;
//	}
//
//	printf("%d", cards[0]);
//
//	return 0;
//}