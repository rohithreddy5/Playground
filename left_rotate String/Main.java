#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char s[100];
  int n;
  cin>>s>>n;
  for(int i=n;i<strlen(s);i++)
     cout<<s[i];
  for(int i=0;i<n;i++) cout<<s[i];
}