// Another Candies https://open.kattis.com/problems/anothercandies

#include <iostream>
#include <cmath>

int main() {
    unsigned long long n, kids, add, sum = 0;
    std::cin >> n;
    for (unsigned int i = 0; i < n; i++) {
        std::cin >> kids;
        for (unsigned int j = 0; j < kids; j++) {
            std::cin >> add;
            sum += add % kids;
        }
        if (sum % kids == 0) {
            std::cout << "YES" << std::endl;
        } else {
            std::cout << "NO" << std::endl;
        }
        sum = 0;
    }
    return 0;
}
