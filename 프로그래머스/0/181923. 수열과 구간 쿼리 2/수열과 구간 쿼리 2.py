def solution(arr, queries):
    answer = []

    for s, e, k in queries:
        valid_values = [value for value in arr[s:e+1] if value > k]

        if valid_values:
            answer.append(min(valid_values))
        else:
            answer.append(-1)

    return answer
