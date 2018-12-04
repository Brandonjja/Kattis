// https://open.kattis.com/problems/cd

#include <iostream>

int main() {
    while (1) {
        int *data = new int[2];
        std::cin >> data[0];
        std::cin >> data[1];
        if (data[0] == 0 && data[1] == 0) {
            break;
        }
        int *jack = new int[data[0]];
        int *jill = new int[data[1]];
        int count = 0;
        for (int i = 0; i < data[0]; i++) {
            std::cin >> jack[i];
        }
        int j = 0;
        for (int i = 0; i < data[0]; i++) {
            std::cin >> jill[i];
            while (j < data[0]) {
                if (jill[i] > jack[j]) {
                    j++;
                    continue;
                } else if (jill[i] == jack[j]) {
                    count++;
                    j++;
                }
                break;
            }
        }
        std::cout << count << std::endl;
        count = 0;
        delete[] jack;
        delete[] jill;
    }
}
