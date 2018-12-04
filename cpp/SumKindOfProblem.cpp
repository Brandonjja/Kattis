// https://open.kattis.com/problems/sumkindofproblem

#include <iostream>

int main() {
    int p, a, b, sum, sum1, sum2, c, c2, i;
    std::cin >> p;

    for (int m = 0; m < p; m++) {
        std::cin >> a >> b;
        sum = sum1 = sum2 = c = c2 = i = 0;
        while (c2 < b) {
            i++;
            if (c < b) {
                sum += i;
                c++;
            }
            if (i % 2 != 0) {
                sum1 += i;
            } else {
                sum2 += i;
                c2++;
            }
        }
        std::cout << a << " " << sum << " " << sum1 << " " << sum2 << std::endl;
    }
}
