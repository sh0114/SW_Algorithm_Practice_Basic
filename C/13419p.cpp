//#include <stdio.h>
//#include <string.h>
//
//int main(){
//	
//	int tc;
//	scanf("%d", &tc);
//
//	for (int i = 0; i < tc; i++){
//		char word[27];
//		char first[27], last[27];
//		int len;
//		scanf("%s", &word);
//		len = strlen(word);
//		
//		if (len == 1){
//			strcpy(first, word);
//			strcpy(last, word);
//		}
//		else if(len % 2 == 1){
//			int k = 0;
//			for (int j = 0; j < len; j++){
//				first[j] = word[k];
//				k += 2;
//				if (k > len){
//					k -= len;
//				}
//			}
//			k = 1;
//			for (int j = 0; j < len; j++){
//				last[j] = word[k];
//				k += 2;
//				if (k >= len){
//					k -= len;
//				}
//			}
//			first[len] = NULL;
//			last[len] = NULL;
//		}
//		else{
//			int k = 0;
//			for (int j = 0; j < len / 2; j++){
//				first[j] = word[k];
//				last[j] = word[k + 1];
//				k += 2;
//				
//			}
//			first[len / 2] = NULL;
//			last[len / 2] = NULL;
//		}
//
//		printf("%s\n", first);
//		printf("%s\n", last);
//	}
//	return 0;
//}