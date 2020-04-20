#include<iostream>
using namespace std;
int main()
{
  int a[100],n,max,min;
  cin>>n;
  for(int i=0;i<n;i++) cin>>a[i];
  max=a[0];
  min=a[0];
  for(int i=1;i<n;i++)
  {
    if(a[i]>max)
    {
      max=a[i];
    }
    if(a[i]<min)
    {
      min=a[i];
    }
  }
  cout<<"Maximum element in array: "<<max<<endl;
  cout<<"Minimum element in array:"<<min;
  }