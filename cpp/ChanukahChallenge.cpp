// https://open.kattis.com/problems/chanukah

#include <iostream>

int main() {
    int n, k, d, ans;
    std::cin >> n;
    for (int i = 0; i < n; i++) {
        std::cin >> k;
        std::cin >> d;
        ans = 0;
        for (int j = 2; j < d + 2; j++) {
            ans += j;
        }
        std::cout << k << " " << ans << std::endl;
    }
}
