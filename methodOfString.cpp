#include<iostream>
#include <cstring>
using namespace std;
int main(){
  
   char s1[] = "c";
   char s2[] = "bcd";
   //strlen
   cout<<strlen(s1)<<endl;

   //strcmp
   int res = strcmp(s1,s2);
   if(res > 0)
      cout<<"s1 is greater"<<endl;
   else if(res < 0)
       cout<<"s2 is greater"<<endl;
   else
       cout<<"both are equal"<<endl ;

   //strcpy
   char s3[] = "a";
   cout<<s3<<endl;
   strcpy(s3,s2);
   cout<<s3;    
}