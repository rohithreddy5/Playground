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
  int max=a[0];
  for(int j=1;j<i;j++)
  {
    if(a[j]>max) max=a[j];
  }
  cout<<"Maximum element is "<<max;
  return 0;
}