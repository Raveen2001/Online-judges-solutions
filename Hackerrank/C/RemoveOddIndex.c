
#include <stdio.h>

int countElement(int a[], int n){
    int count = 0;
    int i;
    for(i = 0; i<n; i++){
        if(a[i] != -1){
            count ++;
        }
    }
    return count;
}

void removeOdd(int a[], int n){
    int count = 1;
    int i;
    for(i = 0; i<n; i++){
        if(a[i] != -1){
            if(count %2 != 0){
                a[i] = -1;
            }
            count ++;
        }
    }
}


int main()
{
    int n;
    scanf("%d", &n);
    int a[n];
    int count;
    int i;
    for(i = 0; i<n; i++){
        a[i] = i+1;
    }
    while(1){
        count = countElement(a, n);
        if(count == 1) break;
        removeOdd(a, n);
    }
    
    for(i = 0; i<n; i++){
        if(a[i] != -1){
            printf("%d", a[i]);
            return 0;
        }
    }
    return 0;
}
