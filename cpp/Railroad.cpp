// Railroad https://open.kattis.com/problems/railroad2

#include <iostream>

int main() {
    int x, y;
    std::cin >> x >> y;

    if (y == 0) {
        std::cout << "possible" << std::endl;
    } else if (y % 2 == 0) {
        std::cout << "possible" << std::endl;
    } else {
        std::cout << "impossible" << std::endl;
    }
    return 0;
}
