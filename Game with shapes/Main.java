#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a;
  cin>>b;
  a=2*a;
  if(a<b | a==b)
    cout<<"circle can be inside a square";
  else
    cout<<"circle cannot be inside a square";
}