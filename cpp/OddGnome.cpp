// Odd Gnome https://open.kattis.com/problems/oddgnome

#include <iostream>

int main() {
    int m;
    std::cin >> m;
    for (int i = 0; i < m; i++) {
        int n;
        std::cin >> n;
        int pre = -1, cur, king;
        for (int j = 0; j < n; j++) {
            std::cin >> cur;
            if (j == 0) {
                pre = cur;
                continue;
            }
            if (cur != ++pre) {
                king = j;
            }
            pre = cur;
        }
        std::cout << king << std::endl;
    }
    return 0;
}
