#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a;
  cin>>b;
  if(a>b && b==00)
    cout<<(100-a);
  else if(a>b && b!=00)
    cout<<(100-(a-b));
  else
    cout<<(b-a);
}