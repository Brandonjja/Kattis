# Guess the Number https://open.kattis.com/problems/guess

import math

min = 1
max = 1001
guess = int(max / 2)
c = 0
for i in range(10):
    print(guess)
    res = input()
    c += 1
    if res == "lower":
        max = guess
        guess = math.ceil((max + min - 1) / 2)
    elif res == "higher":
        min = guess
        guess = math.ceil((max + min - 1) / 2)
    else:
        break
