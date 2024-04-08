def solution(numbers, direction):
    answer = [0]*len(numbers)
    if direction=="right":
        for i in range(0,len(numbers)):
            answer[i]=numbers[i-1]
    elif direction=="left":
        for i in range(0,len(numbers)-1):
            answer[i]=numbers[i+1]
        answer[len(numbers)-1]=numbers[0]
    return answer