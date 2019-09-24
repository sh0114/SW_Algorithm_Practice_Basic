#include <stdio.h>
#include <string.h>
#include <algorithm>

struct {
	char str[51];
	int str_len;
} words[20000];

int static compare(const void* first, const void* second)
{
	if (*(int*)first > *(int*)second){
		return -1;
	}
	else if (*(int*)first < *(int*)second){
		return 1;
	}
	else
		return 0;
}

int main(){
	
	int num = 0;
	scanf("%d", &num);
	printf("%d", num);

	char buf[51];

	for (int i = 0; i < num; i++){
		scanf("%s", &buf);
		strcpy(words[i].str, buf);
		words[i].str_len = strlen(buf);
	}

	qsort(words, 20000, sizeof(int), compare);

	return 0;

}