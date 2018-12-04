// https://open.kattis.com/problems/romans

#include <iostream>
#include <cmath>
int main() {
    float n;
    std::cin >> n;
    std::cout << std::fixed << (int) round((5280.0 / 4854.0) * 1000 * n);
}
