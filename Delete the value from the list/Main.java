#include<iostream>
using namespace std;
int main()
{
  int n,a[100],data;
  cin>>n;
  cout<<"Before deletion:"<<endl;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
    cout<<a[i]<<"-->";
  }
  cout<<"NULL"<<endl;
  cout<<"After deletion:"<<endl;
  cin>>data;
  for(int i=0;i<n;i++)
  {
    if(a[i]!=data) cout<<a[i]<<"-->";
    else continue;
  }
  cout<<"NULL";
  return 0;
}