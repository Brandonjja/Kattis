# Reversed Binary Numbers https://open.kattis.com/problems/reversebinary

dec = float(input())
b = ""
if dec == 0:
	print("0")

while dec > 0:
	b += str(int(dec % 2))
	dec /= 2
	if (dec < 1):
		break

data = list(b[::-1])
ans = 0
mult = 1
for i in range(len(data)):
	if (data[i] == '1'):
		ans += mult
	mult *= 2
print(ans)