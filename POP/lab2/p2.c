#include<stdio.h>
struct products{
	int price;
	char name[10];
	int quant;
} p;

int calcTotal(int price, int quantity){
	int *p, *q;
	p=&price;
	q=&quantity;	
	return (*p)*(*q);
}

void main(){
	printf("Enter product name, price and quantity.\n");
	scanf("%s%d%d",p.name,&p.price,&p.quant);
	int ret = calcTotal(p.price,p.quant);
	printf("Total is %d !\n",ret);
}
