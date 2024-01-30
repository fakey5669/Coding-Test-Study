def solution(array):
    return sum(n == '7' for n in "".join(str(num) for num in array))