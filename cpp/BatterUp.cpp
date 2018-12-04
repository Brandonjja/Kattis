// https://open.kattis.com/problems/batterup

#include <iostream>

int main() {
    int bats, c = 0;
    double ans, sum = 0;
    std::cin >> bats;
    for (int i = 0; i < bats; i++) {
        std::cin >> ans;
        if (!(ans < 0)) {
            sum += ans;
            c++;
        }
    }
    ans = sum / c;
    std::cout << ans;
}
