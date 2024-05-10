#include<iostream>
using namespace std;
int main(){
   char str[] = "gfg";
   char str1[8] = "gfg";
   //if \0 is removed than it will behave differently 
   char str2[] = {'d','g','d','\0'};



   cout<<str<<" ";
   cout<<sizeof(str)<<" ";

   cout<<str1<<" ";
   cout<<sizeof(str1)<<" ";

   cout<<str2<<" ";
   cout<<sizeof(str2)<<" ";

}