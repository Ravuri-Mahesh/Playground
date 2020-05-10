#include<iostream>
using namespace std;
int main()
{
  int a,b,x;
  cin>>a;
  cin>>b;
  cin>>x;
  cout<<"Enter first number : Enter second number : Menu\n";
  cout<<"1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
  switch(x)
  {
    case 1 : std::cout<<(a+b);
    break;
    case 2 : std::cout<<(a-b);
    break;
    case 3 : std::cout<<(a*b);
    break;
    case 4 : cout<<(a/b);
    break;
    case 5 : cout<<(a%b);
    break;
    default : std::cout<<"Invalid operation";
    break;
  }
}