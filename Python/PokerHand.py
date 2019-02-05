# Poker Hand https://open.kattis.com/problems/pokerhand

data = input().split()
dic = {"A":0, "2":0, "3":0, "4":0, "5":0, "6":0, "7":0, "8":0, "9":0, "T":0, "J":0, "Q":0, "K":0}

for i in range(5):
    dic[data[i][0]] += 1

print(max(dic.values()))
