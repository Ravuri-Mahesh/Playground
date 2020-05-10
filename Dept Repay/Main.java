#include<iostream>
using namespace std;
int main()
{
  int x,y,r;
double in,amt,dis,res;
cin>>x>>y>>r;
in=(x*y*r)/100;
amt=x+in;
dis=in*2/100;
res=x+in-dis;
cout<<in<<endl;
cout<<amt<<endl;
cout<<dis<<endl;
cout<<res<<endl; 
return 0;
}