#include<stdio.h>
struct StudentArrayStructure
{
int RollNo;
char Name[20];
int Marks;
};

int main(){

  struct StudentArrayStructure s[3] = {
    {1, "Abhishek", 85}, 
    {2, "Himanshu", 90}, 
    {3, "Akash", 80}};

  for (int i = 0; i<3; i++){
   printf("Roll No: %d, Name: %s, Marks: %d\n", s[i].RollNo, s[i].Name, s[i].Marks);
  }
    return 0;
}