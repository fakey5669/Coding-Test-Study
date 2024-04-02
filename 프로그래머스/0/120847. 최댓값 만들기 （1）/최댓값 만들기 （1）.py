def solution(numbers):
    answer = 0
    n = len(numbers)
    for i in range(n):
        for j in range(i + 1, n):
            multiple = numbers[i] * numbers[j]
            if multiple > answer:
                answer = multiple
    return answer