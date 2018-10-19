# Apaxiaaaaaaaaaaaans! https://open.kattis.com/problems/apaxiaaans

data = list(input())
string = ""
prev = 'A'
for i in range(len(data)):
	if prev != data[i]:
		string += data[i]
	prev = data[i]
print(string)