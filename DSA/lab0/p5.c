#include<stdio.h>
void main(){
char a[100],b[100];
char c[100],d[100];
printf("Enter 2 strings :\n");
scanf("%s%s",&a,&b);
c=a;
d=b;
//using built in functions
printf("Using pre defined functions: \nlength 1: %d\nlength 2: %d \n",strlen(a),strlen(b)); 
int i=strcmp(a,b);
if(i<0)		printf("a is smaller \n");
else if(i>0)	printf("b is smaller \n);
else	printf("Strings are equal \n");

strcpy(a,b);
printf("Copied strings are: %s and %s \n",a,b);
a=c;
strcat(a,b);
printf("Concatenated strings are: %s and %s \n",a,b);
a=c;
printf("Enter substring to find in a.");
char x[20];
scanf("%s",&x);
i=strstr(a,x);
if(i==0)	printf("String not found.\n");
else	printf("String found. \n);
}
