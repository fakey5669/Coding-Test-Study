def solution(s):
    arr = s.split()
    answer = 0
    temp = 0
    for n in arr:
        if not n == 'Z':
            answer+=int(n)
            temp=int(n)
        else:
            answer-=temp
    return answer
            