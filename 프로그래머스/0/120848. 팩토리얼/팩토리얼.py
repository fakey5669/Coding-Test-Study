def solution(n):
    answer = 1
    cnt = 1
    while True:
        answer*=cnt+1
        cnt+=1
        if answer>n: break;
    return cnt-1