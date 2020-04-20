#include<iostream>
using namespace std;
int main()
{
  int n,a[100],k;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cin>>k;
  for(int i=k-1;i>=0;i--) cout<<a[i]<<" ";
  for(int i=k;i<n;i++) cout<<a[i]<<" ";
}