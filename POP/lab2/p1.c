#include<stdio.h>
void main(){
	int width=9;
	for(int i=1; i<=9; i+=2){
		printf("%*d",width,1);
		width--;
		for(int j=2;j<=i;j++){
			printf("%d",j);
		}
		printf("\n");
	}

	width++;

	for(int i=7;i>=1;i-=2){
		width++;		
		printf("%*d",width,1);
		for(int j=2; j<=i; j++){
			printf("%d",j);
		}
		printf("\n");	
	}
	
}

