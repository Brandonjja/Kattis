// Planting Trees https://open.kattis.com/problems/plantingtrees

#include <iostream>
#include <list>
int main() {
    int n, b, c = 0, max = 0;
    std::cin >> n;
    std::list<int> myList;
    for (int i = 0; i < n; i++) {
        std::cin >> b;
        myList.push_back(b);
    }

    myList.sort();
    myList.reverse();
    for (int i : myList) {
        if ((i + c + 2) > max) {
            max = i + c + 2;
        }
        c++;
    }
    std::cout << max;
}
