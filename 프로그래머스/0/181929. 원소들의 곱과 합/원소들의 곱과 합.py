def solution(num_list):
    answer = 0
    multiple = 1
    sumSquare=sum(n for n in num_list)**2
    for n in num_list:
        multiple *= n
    if(multiple<sumSquare):
        answer=1
    return answer