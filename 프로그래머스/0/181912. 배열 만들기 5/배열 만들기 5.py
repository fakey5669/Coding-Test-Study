def solution(intStrs, k, s, l):
    answer = []
    for string in intStrs:
        if int(string[s:s+l])>k:
            answer.append(int(string[s:s+l]))
    return answer