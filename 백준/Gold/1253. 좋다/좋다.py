import sys
input = sys.stdin.readline

n = int(input())
numbers = list(map(int, input().split()))
numbers.sort()
result=0

for k in range(n):
    find = numbers[k]
    i=0
    j=n-1
    while i<j:
        if numbers[i] + numbers[j] == find:
            if i != k and j != k:
                result += 1
                break
            elif i==k:
                i+=1
            elif j==k:
                j-=1
        elif numbers[i]+numbers[j]<find:
            i+=1
        else:
            j-=1
print(result)