# Autori https://open.kattis.com/problems/autori

data = input().split("-")
string = ""
for i in range(len(data)):
	#data2 = data[i].split()
	string += list(data[i])[0]
print(string)