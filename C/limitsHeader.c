#include<stdio.h>
#include<conio.h>
#include<limits.h>   /*header file */

void main(){

    printf("\n signed(+/-) short min value (2 bytes): %d",SHRT_MIN);  /* SHRT_MIN is a global variable */
    printf("\n signed(+/-) short max value (2 bytes): %d",SHRT_MAX);

    printf("\n\n signed(+/-) integer min value (4 bytes): %d",INT_MIN);
    printf("\n signed(+/-) integer max value (4 bytes): %d",INT_MAX);

    printf("\n\n signed(+/-) long min value (4 bytes): %ld",LONG_MIN);
    printf("\n signed(+/-) long max value (4 bytes): %ld",LONG_MAX);

    printf("\n\n signed(+/-) char min value (1 byte): %d",CHAR_MIN);
    printf("\n signed(+/-) char max value (1 byte): %d",CHAR_MAX);

    printf("\n\n unsigned short max value (2 bytes): %d ",USHRT_MAX);  /* unsigned min for eachone is 0 */

    printf("\n\n unsigned integer max value (4 bytes): %d",UINT_MAX);
    
    printf("\n\n unsigned long max value (4 bytes): %ld ",ULONG_MAX);
    
    printf("\n\n unsigned char max value (4 bytes): %ld "),UCHAR_MAX;

    getch();

}