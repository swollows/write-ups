#include <stdio.h>
#include <string.h>

char key[4] = {0x55, 0x32, 0x22, 0x11};
char numbers[] = {29, 103, 108, 92, 20, 73, 96, 81, 6, 3, 65, 78, 39, 87, 116, 84, 39, 7, 3, 127, 18, 79};
int main()
{
	char buf[32];
	scanf("%s", buf);
	int len = strlen(buf);
	if (len != 22)
	{
		puts("wrong!");
		return 1;
	}
	for (int i = 0; i < 22; i++)
	{
		if (numbers[i] != (buf[i] ^ key[i % 4]))
		{
			puts("wrong!");
			return 1;
		}
	}
	puts("great!");
}