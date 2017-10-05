#include<stdio.h>
//print address of each array element
void main(){
int n;
printf("Enter n. \n");
scanf("%d",&n);
int arr[n];
printf("Enter array elements.\n");
for(int i=0; i<n; i++)
	scanf("%d",&arr[i]);

for(int i=0; i<n; i++){
	
	printf("%d %p \n",arr[i],&arr[i]);
	
}
}
