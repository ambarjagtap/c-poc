
#include<bits/stdc++.h>
using namespace std;

int main() 
{
   	float a,b,c; cin>>a>>b>>c;
  	float disc=pow(b,2)-4*a*c;
  
  
  	if(disc>0){
      float r1,r2;
      r1=(-b+sqrt(disc))/2*a;
  	  r2=(-b-sqrt(disc))/2*a;
      cout<<fixed<<setprecision(2)<<"root1 = "<<r1<<"  root2 = "<<r2;
    }
  	else if(disc<0){
      float real,img;
      real=-b/(2*a);
      img=sqrt(-disc)/2*a;
  	
      printf("root1 = %.2f + %.2fi  ",real,img);
      printf("root2 = %.2f - %.2fi",real,img);
   }
  	else{
      float r;
      r=(-b+sqrt(pow(b,2)-4*a*c))/2*a;
     
      cout<<fixed<<setprecision(2)<<"root1 = "<<r<<"  root2 = "<<r;
    }
  
  
    return 0;
}