#include<stdio.h>

void callByValue(int a, int b){
int temp;
temp=a;
a=b;
b=temp;
printf("Using call by value, a and b are %d and %d.\n",a,b);
}

void callByRef(int *x, int *y){
int temp;
temp=*x;
*x=*y;
*y=temp;
}

void main(){
int a,b,*x,*y;
printf("Enter a and b.");
scanf("%d%d",&a,&b);
x=&a;
y=&b;
callByValue(a,b);

callByRef(x,y);
printf("Using call by reference, a and b are %d and %d",*x,*y);
}
