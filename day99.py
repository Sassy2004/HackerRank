n=int(input())
d={}
for i in range(n):
    s=input()
    if s in d:
        d[s]+=1
    else:
        d[s]=1
print(len(d))
print(*d.values())
