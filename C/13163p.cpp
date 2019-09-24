//#include <stdio.h>
//#include <string.h>
//#include <stdlib.h>
//
//int main(){
//	int n = 1;
//	scanf("%d", &n);
//
//	for (int i = 0; i < n; i++){
//		char nickname[101], godname[101];
//		char nickname_length;
//		int count = 0;
//		int point = 0;
//		int god_point = 0;
//
//		getchar();
//		scanf("%[^\n]", &nickname);
//		nickname_length = strlen(nickname);
//		strcpy(godname, "god");
//
//		for (int j = 0; j < nickname_length; j++){
//
//			if (count == 0 && nickname[j] == ' '){
//				count++;
//				continue;
//			}
//			else if (count == 0){
//				point++;
//				continue;
//			}
//			else if(nickname[j]==' '){
//				count++;
//				continue;
//			}
//			else {
//				godname[god_point + 3] = nickname[j];
//				god_point++;
//			}
//		}
//
//		godname[nickname_length - count - point + 3] = NULL;
//		printf("%s\n", godname);
//
//	}
//
//
//
//	return 0;
//}