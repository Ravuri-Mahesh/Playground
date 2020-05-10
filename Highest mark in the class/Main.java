#include<iostream>
using namespace std;
int main()
{
  int a[10],n,i,l;
   cin>>n;
   for(i = 0;i < n; i++){
    cin>>a[i];
   }
  l=a[0];
 for(i=1;i<n;i++)
 {
 if(a[i]>l)
   l=a[i];
 }
 std::cout<<l;
 return 0;
}