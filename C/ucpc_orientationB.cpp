//#include <stdio.h>
//
//void quickSort(long long int *cards, int left, int right) {
//	int i = left, j = right;
//	long long int pivot = cards[(left + right) / 2];
//	long long int temp;
//	
//	do
//	{
//		while (cards[i] < pivot)
//			i++;
//		while (cards[j] > pivot)
//			j--;
//		if (i <= j)
//		{
//			temp = cards[i];
//			cards[i] = cards[j];
//			cards[j] = temp;
//			i++;
//			j--;
//		}
//	} while (i <= j);
//
//	if (left < j)
//		quickSort(cards, left, j);
//	if (i < right)
//		quickSort(cards, i, right);
//}
//
//int main(){
//	long long int n, m;
//	long long int mins_sum = 0;
//	long long int cards[1001];
//	scanf("%lld %lld", &n, &m);
//
//	for (int i = 0; i < n; i++){
//		scanf("%lld", &cards[i]); 
//	}
//	
//	for (int k = 0; k < m; k++){
//		quickSort(cards, 0, n-1);
//		mins_sum = cards[0] + cards[1];
//		cards[0] = mins_sum;
//		cards[1] = mins_sum;
//	}
//
//	long long int result_sum = 0;
//
//	for (int i = 0; i < n; i++){
//		result_sum += cards[i];
//	}
//
//	printf("%lld", result_sum);
//	return 0;
//}