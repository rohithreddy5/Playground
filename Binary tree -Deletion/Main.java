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
  int k,f=0;
  cin>>k;
  for(int j=0;j<i;j++)
  {
    if(a[j]==k)
    {
      f=1;
      break;
    }
  }
  if(f==1) cout<<k;
  else cout<<"Element not found";
}