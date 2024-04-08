def solution(rsp):
    answer = ''
    for i in rsp:
        if i=="2":
            answer=answer+str(0)
        elif i=="0":
            answer=answer+str(5)
        else:
            answer=answer+str(2)
    return answer