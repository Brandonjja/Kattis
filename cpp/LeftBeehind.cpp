// Left Beehind https://open.kattis.com/problems/leftbeehind

#include <iostream>

int main() {
    int x, y;
    while (true) {
        std::cin >> x;
        std::cin >> y;
        if (x == 0 && y == 0) {
            break;
        }
        if (x + y == 13) {
            std::cout << "Never speak again." << std::endl;
        } else if (x > y) {
            std::cout << "To the convention." << std::endl;
        } else if (y > x) {
            std::cout << "Left beehind." << std::endl;
        } else {
            std::cout << "Undecided." << std::endl;
        }
    }
}
