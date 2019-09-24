//#include <stdio.h>
//#include <stdlib.h>
//#include <algorithm>
//
//int static compare(const void* first, const void* second)
//{
//	if (*(int*)first > *(int*)second)
//		return -1;
//	else if (*(int*)first < *(int*)second)
//		return 1;
//	else
//		return 0;
//}
//
//int main(){
//	int num;
//	int temp[10];
//	for (int i = 0; i < 10; i++){
//		temp[i] = -1;
//	}
//
//	scanf("%d", &num);
//	int check = 0;
//	while (num){
//		temp[check++]= num % 10;
//		num = num / 10;
//	}
//
//	qsort(temp, 10, sizeof(int), compare);
//
//	for (int j =0; j < check; j++){
//		if (temp[j] >= 0){
//			printf("%d", temp[j]);
//		}
//	}
//
//	return 0;
//}