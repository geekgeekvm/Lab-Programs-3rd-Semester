#include <stdio.h>
#include <string.h>

void main()

{

    char a, word[50];

    int i, freq = 0, flag = 0;
    printf("Enter a string: ");

    scanf("%s", word);

    printf("Enter character: ");

    scanf("%c", &a);

    printf("Positions of '%c' in string is: ", a);

    for (i = 0; i < strlen(word); i++)

    {

        if (word[i] == a)

        {

            flag = 1;

            printf("%d  ", i + 1);

            freq++;

        }

    }

    if (flag)
        printf("\nRepeation of %c in string is %d:", a, freq);


    else
        printf("None\n");

    

}
