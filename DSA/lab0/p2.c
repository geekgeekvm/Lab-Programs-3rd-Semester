#include<stdio.h>
//reverse a number using pointers
void main(){
int n, *p, sum=0;
printf("Enter n \n");
scanf("%d",&n);
p=&n;
while(*p>0){
sum=sum*10+(*p%10);
*p=*p/10;
}
printf("Reversed number is %d \n",sum);
}
