// Job Expenses https://open.kattis.com/problems/jobexpenses

#include <iostream>

int main() {

	std::ios_base::sync_with_stdio(false);
	std::cin.tie(NULL);

	int numOfInputs, currentNum, total = 0;
	std::cin >> numOfInputs;

	while (numOfInputs--) {
		std::cin >> currentNum;
		if (currentNum < 0) {
			total -= currentNum;
		}
	}
	std::cout << total;
}
