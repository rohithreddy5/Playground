#include<iostream>
#include<cstring>
using namespace std;
int main()
{
   char s[100],v[100];
   cin>>s>>v;
  int n=strlen(v),count=0;
   for(int i=0;i<s[i]!='\0';i++)
   {
     for(int j=0;j<n;j++)
     {
       if(v[j]==s[i])
       {
         count++;
       }
     }
   }
  if(count>n) cout<<"Word found in sentence\n";
  else cout<<"Word not found in sentence\n";
   return 0;
}