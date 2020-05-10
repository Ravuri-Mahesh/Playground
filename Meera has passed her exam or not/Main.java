#include<iostream>
using namespace std;
int main()
{
 int n,i,value,j=0,k;
 std::cin>>n;
 int a[20];
 for(i=0; i<n; i++)
 {
 std::cin>>a[i];
 }
 cin>>k;
 for(i=0;i<n;i++)
 {
 if(a[i]==k){
   j=1;
   break;
 }
 else
   j=0;
 }
 if(j==1)
   cout<<"She passed her exam";
 else
   cout<<"She failed";
 return 0;
}
