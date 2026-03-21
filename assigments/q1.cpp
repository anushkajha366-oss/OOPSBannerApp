#include <iostream>
using namespace std;

int main()
{
    int num;

    cout << "Enter an integer: ";
    cin >> num;

    if(num == 0)
    {
        cout << "Neither";
    }
    else if(num % 2 == 0)
    {
        cout << "Even";
    }
    else
    {
        cout << "Odd";
    }

    return 0;
}