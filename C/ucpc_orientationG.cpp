//#include <stdio.h>
//#include <string.h>
//int main(){
//	char word[1001];
//	scanf("%[^\n]", &word);
//
//	int count = 0;
//	for (int i = 0; i < strlen(word); i++) {
//		if (count == 4){
//			break;
//		}
//
//		switch (count){
//		case 0:{
//			if (word[i] == 'U')
//				count++;
//			break;
//		}
//		case 1:{
//			if (word[i] == 'C')
//				count++;
//			break;
//		}
//		case 2:{
//			if (word[i] == 'P')
//				count++;
//			break;
//		}
//		case 3:{
//			if (word[i] == 'C')
//				count++;
//			break;
//		}
//		}
//	}
//
//	printf("%d", count);
//
//	if (count == 4){
//		printf("I love UCPC");
//	}
//	else{
//		printf("I hate UCPC");
//	}
//	return 0;
//}