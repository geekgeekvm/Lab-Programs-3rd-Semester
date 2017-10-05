#include<stdio.h>
struct stud
{
 int rollno;
 char name[10];
} s[10] ;
void main()
{
 int i, n ;
 printf("Enter the number of students : ") ;
 scanf("%d", &n) ;
 for(i = 0 ; i < n ; i++)
 {
  printf("\nEnter the roll number : ") ;
  scanf("%d", &s[i].rollno) ;
  printf("\nEnter the name : ") ;
  scanf("%s", s[i].name) ;
 } 
 
 for(i=0; i<n; i++)
	printf("Rollno and name of student %d is: %d	%s \n",i+1, s[i].rollno, s[i].name);
}
