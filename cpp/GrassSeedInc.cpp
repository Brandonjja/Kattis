// https://open.kattis.com/problems/grassseed

#include <iostream>
#include <iomanip>

int main() {
    double c, sum = 0, a, b;
    int n;
    std::cin >> c >> n;

    for (int i = 0; i < n; i++) {
        std::cin >> a >> b;
        sum += (a * b);
    }
    std::cout << std::setprecision(10) << sum * c;
}
