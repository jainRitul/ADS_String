#include<iostream>
#include<algorithm>

using namespace std;
bool checkPali(string &str){
   string rev = str;
   reverse(rev.begin(),rev.end());
   return str == rev;
}
int main(){
    string str = "abbac";
    cout<<checkPali(str);
}
