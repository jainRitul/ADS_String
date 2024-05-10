#include<iostream>
#include <cstring>
using namespace std;
int main(){
   //string is class and we created obj of this string that is str and using function on that string like length and all


   string str = "ritul jain";

   cout<<str.length()<<endl;
   cout<<str<<endl;
   cout<<str + "sandeep"<<endl; 
   cout<<str<<endl;
   cout<<str.substr(1,4)<<endl;
   cout<<str.find("jain")<<endl;


   //COMPARING TWO STRINGS

   string s1="bcd";
   string s2="bcd";
   if(s1 == s2)
    cout<<"equal";
   else if(s1 > s2)
    cout<<"s1 is greater";
   else
    cout<<"s2 is greater";

   cout<<endl;   
}