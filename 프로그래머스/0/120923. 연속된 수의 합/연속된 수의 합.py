def solution(n, total):
    return [total/n+(1-n)/2+i for i in range(n)]