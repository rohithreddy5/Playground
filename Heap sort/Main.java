#include<iostream>
using namespace std;
int main()
{
  int n,a[100];cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(int i=0;i<n;i++)
  {
    for(int j=i+1;j<n;j++)
    {
      if(a[i]>a[j])
      {
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
      }
    }
  }
  cout<<"Sorted array :\n";
  for(int i=0;i<n;i++) cout<<a[i]<<" ";
}