#include <stdio.h>

 
int main(){
    int rows, cols, size, rowCounter, colCounter;
    int inputMatrix[50][50];
    printf("Enter size square matrix\n");
    scanf("%d", &size);
    rows = cols = size;
     
    printf("Enter Matrix of size %dX%d\n", rows, cols);
    
    for(rowCounter = 0; rowCounter < rows; rowCounter++){
        for(colCounter = 0; colCounter < cols; colCounter++){
            scanf("%d", &inputMatrix[rowCounter][colCounter]);
        }
    }
    
    printf("Lower triangul is:\n");
    for(rowCounter = 0; rowCounter < rows; rowCounter++){
        for(colCounter = 0; colCounter < cols; colCounter++){
            if(rowCounter < colCounter){
                /* Upper triangle element*/
                printf("%d ", 0);
            } else {
                /* Lower triagle element*/
                printf("%d ", inputMatrix[rowCounter][colCounter]);
            }
        }
        printf("\n");
    }
    
    return 0;
}
