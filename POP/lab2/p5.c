#include<stdio.h>
void main(){
	int a[10], b[10], c[10];
	int m,n,i,j,k;
	printf("Enter size of first and second array.\n");
	scanf("%d%d",&m,&n);
	printf("Enter elements of first array.\n");
	for(i=0; i<m; i++)
		scanf("%d",&a[i]);
	
	printf("Enter elements of second array.\n");
	for(j=0; j<n; j++)
		scanf("%d",&b[j]);

	//sorting a
	for(i=0; i<m; i++)
		for(j=0; j<m-1; j++){
			if(a[j]<a[j+1]){
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	//sorting b
	for(i=0; i<n; i++)
		for(j=0; j<n-1; j++){
			if(b[j]<b[j+1]){
				int temp=b[j];
				b[j]=b[j+1];
				b[j+1]=temp;
			}
		}
		 

	i=0,j=0,k=0;
	while(i<m&&j<n){
		if(a[i]>=b[j]){
			c[k]=a[i];
			k++;
			i++;
		}
		else{
			c[k]=b[j];
			k++;
			j++;
		}
	}
	while(i<m){
		c[k]=a[i];
		k++;
		i++;
	}
	while(j<n){
		c[k]=b[j];
		k++;
		j++;
	}	

	printf("Elements of merged array are:\n");
	for(int k=0; k<m+n; k++)
		printf("%d ",c[k]);
}
