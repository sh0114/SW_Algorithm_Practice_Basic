//#include<stdio.h>
//
//int main(){
//	int temp[1001] = { 0, };
//
//	int count = 1;
//	for (int i = 1; i < 46; i++){
//		for (int j = 0; j < i; j++){
//			temp[count] = i;
//			count++;
//			if (count > 1000){
//				break;
//			}
//		}
//	}
//
//	int first, last;
//	int sum = 0;
//	scanf("%d %d", &first, &last);
//
//	for (int i = first; i <= last; i++){
//		sum += temp[i];
//	}
//
//	printf("%d", sum);
//
//	return 0;
//}