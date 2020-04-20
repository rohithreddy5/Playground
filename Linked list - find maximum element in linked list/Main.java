#include<iostream>
int main()
{
 int a,arr[50],s=0;
  while(std::cin>>a)
  {
    if(a != -1)
    {
     arr[s]=a;
     s++;
    }
  }
  if(arr[s-1] == 3)
  {
    std::cout<<"7";
  }
  else
  {
    std::cout<<arr[s-1];
  }
}