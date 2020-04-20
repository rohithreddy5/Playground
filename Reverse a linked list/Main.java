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
  cout<<"Before Reversing the list:\n";
  for(int k=0;k<i;k++)
    cout<<a[k]<<endl;
  cout<<"After Reversing the list:\n";
  for(int k=i-1;k>=0;k--)
    cout<<a[k]<<endl;
  return 0;
}