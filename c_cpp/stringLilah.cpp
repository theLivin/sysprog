#include <iostream>
#include <string>

// Find number of occurances of 'c' in the first 'n' characters of 
// 'fstr' suppose the string 'fstr' is repeated infinite times.
int numOfOccurrances(char c, std::string fstr, int n){
    int count = 0, i = 0, strLen = fstr.size();

    for(int itr = 0; itr < n; itr++){
        if(fstr[i++] == c){ 
            // Increase counter if current character matches the one we're looking for
            count ++;
        }
        if(i >= strLen){
            // Reset index
            i = 0;
        }    
    }

    return count;
}

int main(int argc, char *argv[]){
    std::string userStr;
    int n;
    char searchChar = 'a';

    // Get user string
    std::cout<<"Enter a string: ";
    std::cin>>userStr;

    // Get number of characters to consider
    std::cout<<"Enter number of characters to consider: ";
    std::cin>>n;

    std::cout<<"\n'"<<searchChar<<"' appears "<<numOfOccurrances(searchChar, userStr, n)<<" time(s).";

    return EXIT_SUCCESS;
}