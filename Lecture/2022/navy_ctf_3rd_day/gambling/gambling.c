// gcc -o gambling gambling.c
#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>
#include <unistd.h>
int win;

void read_flag(){
    char buffer[100];
    FILE *fp = fopen("flag", "r");
    fgets(buffer, sizeof(buffer), fp);
    printf("%s\n", buffer);
    fclose(fp);
}

void make_random(){
	int fd = open("/dev/urandom", O_RDONLY);
	if(fd==-1){
		printf("error. tell admin\n");
		exit(-1);
	}
	read(fd, &win, 4);
}

int gambling(){
	int money = 1000;
	int bat, luckynum;

	make_random();
	printf("[chall] gambling\n");
	printf("Start Gambling!\n\n");

	while(money >= 0){
		printf("current your money : %d\n\n", money);
		printf("bat your money\n");
		printf("bat money : ");
		scanf("%d", &bat);
		printf("choose lucky number : ");
		scanf("%d", &luckynum);
		
		printf("\nlucky number is %d\n", win);
		if(luckynum == win){
			printf("You Win! ");
			printf(" + %d money\n", bat);
			money += bat;
		} else{
			printf("You Lost! ");
			printf(" - %d money\n", bat);
			money -= bat;
		}
    	make_random();

		if(money > 9999999){
			printf("You are rich!!!!\n");
			return 1;
		}
	}
	printf("You are a beggar!\n");

	return 0;

}

int main(){
	setvbuf(stdout, NULL, _IONBF, 0);
	printf("Hello! This is a challenge for system hacking newbies.\n");
	printf("I hope you enjoy it.\n\n");

	if(gambling()){
		printf("\n======================================\n");
		printf("Congratulation!\n");
		read_flag();
		printf("======================================\n\n");
	}
	else{
		return 0;
	}
	return 0;
}

