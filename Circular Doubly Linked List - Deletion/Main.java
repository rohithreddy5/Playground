#include <iostream> 
using namespace std; 
int main() 
{ 
	int n,x,a[100];
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
    cout<<a[i]<<"-->";
  }
  cin>>x;
  cout<<"\n";
  for(int i=0;i<n-x;i++)
  {
    cout<<a[i]<<"-->";
  }
	return 0; 
}