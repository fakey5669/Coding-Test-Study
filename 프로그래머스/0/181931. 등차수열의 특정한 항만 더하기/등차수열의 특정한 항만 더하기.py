def solution(a, d, included):
    return sum(a+i*d for i, x in enumerate(included) if x)