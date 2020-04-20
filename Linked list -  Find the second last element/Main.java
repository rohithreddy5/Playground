#include<iostream>
using namespace std;
int main()
{
  int a[100],i=0;
  while(1)
  {
    cin>>a[i];
    if(a[i]<0) break;
    i++;
  }
  if(i>=2) cout<<a[i-2]<<" is the second last element in the list";
  else cout<<"There is no second last element in the list";
  return 0;
}