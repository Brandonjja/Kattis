# Kemija https://open.kattis.com/problems/kemija08

s = list(input())
ans = ''
vowels = "aeiou"
i = 0
while i < len(s):
    if (s[i] in vowels):
        ans += s[i]
        i += 3
        continue
    ans += s[i]
    i += 1
print (ans)
