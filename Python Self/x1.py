a = int(input())
b = [int(input()) for i in range(a-1)]
k = 0
for i in range(1, a+1):
    if i not in b:
        k = i
        break
print(k)
