#include <stdio.h>

int main() {
    int num1 = 1; 
    int num2 = 2;

    printf("Antes:\n");
    printf("%d, %d\n", num1, num2);

    Cambio(&num1, &num2);

    printf("Despues:\n");
    printf("%d, %d\n", num1, num2);

    return 0;
}

void Cambio(int *a, int *b) {
    *a = 5412385;
    *b = 666;
}
