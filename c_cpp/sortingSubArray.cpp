#include <iostream>

// constant - size of array
const int size = 11;

// constant - input array
// int input[size] = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
int input[size] = {60, 10, 20, 30, 25, 40, 32, 31, 35, 50, 12};


// function - print elements in array of size, arr_size
void printElements(){
    for(int i=0; i< size; i++)
        std::cout<<input[i]<<" ";
}

// function - find unsorted subarray indices (ie: index-es)
void findUnsortedSubArray(int *startPoint, int *endPoint){
    
    // loop through input array
    for(int i=0; i<size-1; i++){
        // std::cout<<"\ncomparing : "<<input[i]<<" and "<<input[i+1];

        // set starting point of unsorted subarray
        if( input[i] > input[i+1] && (*startPoint == 0 && i == 0)) {*startPoint = i;}
        // set end point of unsorted subarray -----;;;PROBLEM
        if( input[i] > input[i+1] || input[i-1] > input[i]) {*endPoint = i+1;}
    }
}

// function - sorting subarray with insertion sort
void sortSubArray(int *start, int *end){
    // start sorting within subarray from left to right
    for(int i = *start; i <= *end; i++){
        // find smaller element on right of current position
        for(int j = i ; j <= *end; j++){
            // smaller element is found,
            if( input[i] > input[j]) { 
                // swap elements
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }
        }
    }
}

int main(int argc, char *argv[]){
    // print elements in input array
    printElements();    
    
    // set unsorted subarray indices to 0
    int start = 0, end = 0;

    // find unsorted subarray
    findUnsortedSubArray(&start, &end);

    // print start and end of unsorted array
    // std::cout<<"\nstarting point: "<<start
    // <<"\nend point: "<<end<<std::endl;
    std::cout<<"\nunsorted from index "<<start<<" to "<<end<<"\n";

    // sort subarray
    // sortSubArray(&start, &end);

    // print sorted elements
    // printElements();

    return 0;
}