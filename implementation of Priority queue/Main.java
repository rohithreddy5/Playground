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
  for(int k=0;k<i;k++)
  {
    for(int j=k+1;j<i;j++)
    {
      if(a[k]<a[j])
      {
        int t=a[k];
        a[k]=a[j];
        a[j]=t;
      }
    }
  }
  for(int j=0;j<i;j++) cout<<a[j]<<" ";
}