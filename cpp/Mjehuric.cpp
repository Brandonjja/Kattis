// https://open.kattis.com/problems/mjehuric

#include <iostream>

int data[5];

void print() {
    for (int i = 0; i < 5; i++) {
        std::cout << data[i] << " ";
    }
    std::cout << std::endl;
}

int main() {
    int tmp;
    for (int i = 0; i < 5; i++) {
        std::cin >> data[i];
    }
    for (int i = 0; i < 5; i++) {
        for (int j = 1; j < 5; j++) {
            if (data[j] < data[j - 1]) {
                tmp = data[j];
                data[j] = data[j - 1];
                data[j - 1] = tmp;
                print();
            }
        }
    }
}
