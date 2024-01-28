def solution(numLog):
    answer = ''
    for idx in range (0, len(numLog)):
        if idx == len(numLog)-1: break
        if numLog[idx+1] - numLog[idx]==1:
            answer+='w'
        elif numLog[idx+1] - numLog[idx]==-1:
            answer+='s'
        elif numLog[idx+1] - numLog[idx]==10:
            answer+='d'
        elif numLog[idx+1] - numLog[idx]==-10:
            answer+='a'
    return answer