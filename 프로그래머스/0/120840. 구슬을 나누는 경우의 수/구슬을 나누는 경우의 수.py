def solution(balls, share):
    answer = 0
    top = 1
    bottom = 1
    for i in range(balls-share+1, balls+1):
        top*=i
    for i in range(1, share+1):
        bottom*=i
    answer=top/bottom
    return answer