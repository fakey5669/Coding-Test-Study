def solution(num_list, n):
    answer = [[]]
    j = 0
    for i in range(len(num_list)):
        if len(answer[j]) < n:
            answer[j].append(num_list[i])
        else:
            answer.append([num_list[i]])
            j += 1
    return answer