#include<iostream>
using namespace std;
int main()
{
  int a[100],b[100],k=0,l=0;
  while(1)
  {
    cin>>a[k];
    if(a[k]==-1) break;
    k++;
  }
  for(int i=0;i<k;i++)
  {
    for(int j=i+1;j<k;j++)
    {
      b[l]=a[i]+a[j];
      l++;
    }
  }
  int max=b[0];
  for(int i=1;i<l;i++)
  {
    if(b[i]>max)
      max=b[i];
  }
  cout<<max;
  return 0;
}