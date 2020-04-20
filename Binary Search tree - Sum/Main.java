#include<iostream>
using namespace std;
int main()
{
  int a[100],i=0,s=0;
  while(1)
  {
    cin>>a[i];
    s=s+a[i];
    if(a[i]==-1) break;
    i++;
  }
  cout<<"Sum of all nodes are "<<s+1;
  return 0;
}