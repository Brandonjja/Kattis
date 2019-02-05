// Free Food https://open.kattis.com/problems/freefood

#include <iostream>
#include <set>

int main() {
    std::set<int> days;
    int n;
    std::cin >> n;
    int start, end;
    for (int i = 0; i < n; i++) {
        std::cin >> start;
        std::cin >> end;
        for (int j = start; j <= end; j++) {
            days.insert(j);
        }
    }
    std::cout << days.size();
    return 0;
}
