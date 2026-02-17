// array addition
#include<stdio.h>
int main(){
  int a[] = {1, 3, 4, 5, 7, 8};
  
  int sum = 0;
  for (int i = 0; i< 6; i++){
    sum += a[i];
  }
  printf("The sum is %d\n", sum);
  return 0;
}