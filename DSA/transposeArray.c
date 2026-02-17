#include<stdio.h>
int main(){
  int a[2][2] = {{1, 2}, {3, 4}};
  int b[2][2] = {{5, 6}, {0, 7}};
  int c[2][2];
  for (int i = 0; i < 2; i++){
    for (int j = 0; j < 2;  j++){
      c[i][j] = a[j][i];
      printf("%d ", c[i][j]);
    }
    printf("\n");
  }
}