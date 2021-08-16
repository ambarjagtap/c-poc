#include<iostream>
#include<string>
#include<map>
#include<vector>
#include<algorithm>
using namespace std;

// function for sorting
bool cmp(pair<char,int>a , pair<char,int>b){
    a.second > b.second;
}

int main() {
	
	//input no of teams     //no of matches
	int n; cin>>n;            int m=n*(n-1)/2;
	
	
	// create a map
	map<char,int>point_table;
	
	
	// iterate over no of matches to be played
	for(int i=0;i<m;i++){
	    
	    // input the match result
	    char t1,t2; cin>>t1>>t2; 
	    int g1,g2;  cin>>g1;  cin.ignore(256,'-');  cin>>g2;
	    
	    
	    // draw
	    if(g1==g2){
	        point_table[t1]+=1;
	        point_table[t2]+=1;
	        
	    }
	    //team 1 wins
	    else if(g1>g2){
	        point_table[t1]+=3;
	    }
	    //team 2 wins
	    else{
	        point_table[t2]+=3;
	    }
	
	}
	
	//create a vector to store data of map
	vector<pair<char,int>>vec;
	
	//insert into vector
	for(auto &it:point_table){
	    vec.push_back(it);
	}
	
	//sort the vector 
	sort(vec.begin(),vec.end(),cmp);
	
	// output the result
	for(auto &it: vec){
	    cout<<it.first<<" "<<it.second<<endl;
	}
	
	return 0;
}
