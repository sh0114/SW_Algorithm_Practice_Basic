//#include <stdio.h>
//#include <string.h>
//
//int main(){
//
//	char hex[7];
//	scanf("%s", &hex);
//	int hex_len = strlen(hex);
//	int hex_count = 1;
//	int result = 0;
//
//	for (int i = 0; i < hex_len - 1; i++){
//		hex_count *= 16;
//	}
//
//	for (int i = 0; i < hex_len; i++){
//		if (hex[i] == '0'){
//			result += hex_count * 0;
//		}
//		else if (hex[i] == '1'){
//			result += hex_count * 1;
//		}
//		else if (hex[i] == '2'){
//			result += hex_count * 2;
//		}
//		else if (hex[i] == '3'){
//			result += hex_count * 3;
//		}
//		else if (hex[i] == '4'){
//			result += hex_count * 4;
//		}
//		else if (hex[i] == '5'){
//			result += hex_count * 5;
//		}
//		else if (hex[i] == '6'){
//			result += hex_count * 6;
//		}
//		else if (hex[i] == '7'){
//			result += hex_count * 7;
//		}
//		else if (hex[i] == '8'){
//			result += hex_count * 8;
//		}
//		else if (hex[i] == '9'){
//			result += hex_count * 9;
//		}
//		else if (hex[i] == 'A'){
//			result += hex_count * 10;
//		}
//		else if (hex[i] == 'B'){
//			result += hex_count * 11;
//		}
//		else if (hex[i] == 'C'){
//			result += hex_count * 12;
//		}
//		else if (hex[i] == 'D'){
//			result += hex_count * 13;
//		}
//		else if (hex[i] == 'E'){
//			result += hex_count * 14;
//		}
//		else{
//			result += hex_count * 15;
//		}
//
//		hex_count = hex_count / 16;
//	}
//
//	printf("%d", result);
//
//	return 0;
//}