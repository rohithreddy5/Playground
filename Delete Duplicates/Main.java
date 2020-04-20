#include<iostream>
#include <bits/stdc++.h> 
using namespace std;
int main()
{
  int a[100],k=0;
  while(1)
  {
    cin>>a[k];
    if(a[k]==-1) break;
    k++;
  }
  cout<<"Linked list before removal of duplicates\n";
  for(int i=0;i<k;i++) cout<<a[i]<<endl;
  cout<<"Linked list after removal of duplicates\n";
  int i;
  set<int> s; 
    for (i = 0; i < k; i++) { 
        s.insert(a[i]); 
    } 
    set<int>::iterator it; 
    for (it = s.begin(); it != s.end(); ++it) 
        cout << *it << "\n"; 
  return 0;
}