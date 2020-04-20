#include<iostream>
using namespace std;
int main()
{
  int a[100],i=0;
  while(1)
  {
    cin>>a[i];
    if(a[i]==-1) break;
    i++;
  }
 // cout<<i;
  cout<<"Number of nodes are "<<(i+1)/2;
  return 0;
}