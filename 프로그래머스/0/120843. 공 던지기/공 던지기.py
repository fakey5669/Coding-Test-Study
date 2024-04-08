def solution(numbers, k):
    answer = 0
    i = 0
    
    for _ in range(k):
        answer=numbers[i]
        i+=2
        if i>len(numbers)-1:
            i-=len(numbers)
    return answer