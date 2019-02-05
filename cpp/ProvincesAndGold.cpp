// Provinces and Gold https://open.kattis.com/problems/provincesandgold

#include <iostream>

int main() {
    int g, s, c, total;
    std::cin >> g >> s >> c;
    total = g * 3 + s * 2 + c;

    if (total >= 8) {
        std::cout << "Province or Gold" << std::endl;
    } else if (total >= 6) {
        std::cout << "Duchy or Gold" << std::endl;
    } else if (total == 5) {
        std::cout << "Duchy or Silver" << std::endl;
    } else if (total >= 3) {
        std::cout << "Estate or Silver" << std::endl;
    } else if (total == 2) {
        std::cout << "Estate or Copper" << std::endl;
    } else {
        std::cout << "Copper" << std::endl;
    }
    return 0;
}
