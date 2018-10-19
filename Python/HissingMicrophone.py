# Hissing Microphone https://open.kattis.com/problems/hissingmicrophone

data = list(input())
flag = 0
prev = '0'
for i in range(len(data)):
	if prev == data[i] and prev == 's':
		print("hiss")
		flag = 1
		break
	prev = data[i]
if flag == 0:
	print("no hiss")