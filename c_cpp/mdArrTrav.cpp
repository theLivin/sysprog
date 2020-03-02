#include <iostream>
#include <stdlib.h>
#include <cstring>

using namespace std;

int main(int argc, char *argv[]) {

    int row_size = 0, column_size = 0;

    cout << "Enter row size of array: ";
    cin >> row_size;
    cout << "Enter column size of array: ";
    cin >> column_size;

    float multidimensional_array[row_size][column_size];
    for(int i = 0; i < row_size; i++)
        for(int j = 0; j < column_size; j++)
            multidimensional_array[i][j] = 0;

    cout << "Array created!\n";

    cout << "\t***\tMENU\t***\n";
    cout << "add - To add element\ndelete - To delete element\ndisplay - To display elements in array\nretrieve - To get the value of a cell\nend - To quit program\n\n";

    string user_action;
    float user_number;
    int add_i = 0, add_j = 0;

    begin: cin >> user_action;

    if(user_action == "add") {
        float add_num = 0;
        cout << "Enter number to add: ";
        cin >> user_number;
        if(add_j == column_size) {
            add_i++;
            add_j = 0;
        }
        if(add_i == row_size && add_j == column_size) {
            cout << "Array is full!";
            goto begin;
        }
        multidimensional_array[add_i][add_j++] = user_number;

        goto begin;
    }

    else if(user_action == "delete") {
        cout << "Enter number to delete: ";
        cin >> user_number; 

        goto begin;
    }

    else if(user_action == "display") {
        for(int i = 0; i < row_size; i++) {
            for(int j = 0; j < column_size; j++) {
                cout << multidimensional_array[i][j] << " ";
            }
            cout << '\n';
        }

        goto begin;
    }

    else if(user_action == "retrieve") {


        goto begin;
    }

    else if(user_action == "end") {
        cout << "Exiting...";
        goto end;
    }

    else {
        cout << "Unknown command! Please see menu above\n";
        goto begin;
    }


    end: return EXIT_SUCCESS;
}