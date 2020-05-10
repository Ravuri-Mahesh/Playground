#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>b>>a>>c;
  a=a*75;
  c=c*30;
  if((a+c)<=b)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}