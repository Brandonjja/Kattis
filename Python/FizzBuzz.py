# FizzBuzz https://open.kattis.com/problems/fizzbuzz

data = list(map(int, input().split()))
x = data[0]
y = data[1]
n = data[2]

for i in range(1, n+1):
	if (i % x == 0 and i % y == 0):
		print("FizzBuzz")
	elif (i % x == 0):
		print("Fizz")
	elif (i % y == 0):
		print("Buzz")
	else:
		print(i)
