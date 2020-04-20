#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  cout<<"Enter the input string:\n";
  char s[100];
  cin.getline(s,100);
  cout<<"Size of the string: "<<strlen(s);
}