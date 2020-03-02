
#include <iostream>
#include <vector>
using namespace std;

vector<int> swapWithFirst(vector<int> &v, int index){
  int temp;
  temp = v[0];
  v[0] = v[index];
  v[index] = temp;

  return v;
}

vector<int> multiplyElements(vector<int> &vec){
  vector<int> v = vec;
  vector<int> outVector;
  int itr = 1;
  int counter = 0; //first iteration
  int prod = 1;

  while(counter != v.size()){
    prod = prod * v[itr];
    itr++;
    if(itr >= v.size()){
      outVector.push_back(prod);
      counter++;
      swapWithFirst(v, counter);
      itr = 1;
      prod=1;
    }
  }

  return outVector;
}

void printOut(vector<int> &v){
  for(int i=0; i< v.size(); i++){cout<<v[i]<<" ";}
}

int main(int argc,char * argv[]){
  //input array
  vector<int> input = {10, 3, 5, 6, 1};
  vector<int> output;

  output = multiplyElements(input);

  cout<<"input : ";printOut(input);
  cout<<"\n";
  cout<<"output : ";printOut(output);


  return  0;
}

