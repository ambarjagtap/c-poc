/* func_snakesNladder */
#include<stdio.h>
#include<conio.h>
void downone(int);//level 1
void downleft(int);//level 2 left branch
void downright(int);//level 2 right branch

/*level 0 MAIN LEVEL*/
void main(){
    printf("This is level 0 : the MAIN program.\n");

    printf("About to go down a level \n\n");

    downone(1);

    printf("\n\nBack at the end of the start !! \n");
    getch();



}

/* level 1*/
void downone(int a){
    printf("down here at level %d , all is well.\ngoing down left at level 2.",a);

    downleft(2);
    printf("\n\nThis is level %d .About to go down at level 2 right branch.",a);
    downright(2);
    printf("\nThis is level 1 .going back up a level 0(main level).");
}

/*level 2 left*/
void downleft(int a){
    printf("\n\nThis is the deepest level %d and left branch.\n Going up at level 1 and then going right deep branch at level %d.\n ",a,a);
}

/*level 2 right */
void downright(int a){
    printf("\n\nThis is deepest right branch in heiarchy at level %d.\n",a);
    printf("Going back up at level 1\n");
}
