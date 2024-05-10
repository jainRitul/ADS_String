#include<iostream>
using namespace std;
void search(string str,string pat)
{
    int n = str.length();
    int m = pat.length();
    int ind = str.find(pat);
    if(ind != string::npos)
        cout<<ind<<" ";
    while (str.find(ind+1)!= string::npos)
    {
       
    }
        
    

}
int main(){
    string str = "geeksforgeeks";
    string pat = "eeks";
    search(str,pat);
}