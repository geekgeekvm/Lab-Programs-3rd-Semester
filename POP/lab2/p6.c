#include<stdio.h>
void main(){
	int n;
	printf("Enter size of array.\n");
	scanf("%d",&n);
	int arr[n];
	printf("Enter elemnts.\n");
	for(int i=0; i<n; i++)
		scanf("%d",&arr[i]);
	int min=arr[0], max=arr[0], posmin, posmax;
	for(int i=0; i<n; i++){
		if(arr[i]<=min){
			min=arr[i];
			posmin=i;
		}
		if(arr[i]>=max){
			max=arr[i];
			posmax=i;
		}
	}
	int temp=arr[posmin];
	arr[posmin]=arr[posmax];
	arr[posmax]=temp;
	for(int i=0; i<n; i++)
		printf("%d ",arr[i]);
}
	
