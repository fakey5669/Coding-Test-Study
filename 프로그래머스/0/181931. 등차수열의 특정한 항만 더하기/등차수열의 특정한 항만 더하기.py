def solution(a, d, included):
    answer = 0
    index = 0
    for n in range(a, a + len(included) * d, d):
        if included[index]:
            answer += n
        index += 1
    return answer