def solution(numbers):
    array = sorted(numbers)
    return max(array[0]*array[1], array[-1]*array[-2])