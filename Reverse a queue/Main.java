#include<iostream>
using namespace std;
int main()
{
  int a[100],i=0,x;
  while(1)
  {
    cin>>x;
    if(x==-1) break;
    else
    {
      a[i]=x;
      i++;
    }
  }
  if(i==0) cout<<"Queue is empty\n";
  else
  { 
    cout<<"Before reversing:\n";
    for(int k=0;k<i;k++) cout<<a[k]<<" ";
  cout<<"\nAfter reversing:\n";
  for(int k=i-1;k>=0;k--) cout<<a[k]<<" ";
  }
  return 0;
}