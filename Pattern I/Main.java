#include<iostream>
using namespace std;
int main()
{
 int n;
 cin>>n;
 for(int i=n;i<=n+3;i++)
 {
 for(int j=0;j<=i-n;j++)
 {
 cout<<i;
 }
 cout<<"\n";
 }
 for(int i=n+3;i>=n;i--)
 {
 for(int j=0;j<=i-n;j++)
 {
 cout<<i;
 }
 cout<<"\n";
 }
}