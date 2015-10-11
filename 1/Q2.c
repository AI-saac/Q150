#include<stdio.h>

int main(int argc, char *argv[])
{
    for (int i = 0; i < argc; i++) {
        printf("%d番目の引数 = %s\n", i, argv[i]);
    }
}
