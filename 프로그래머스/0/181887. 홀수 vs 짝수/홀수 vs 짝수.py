def solution(num_list):
    return max(sum(n for n in num_list[0::2]), sum(n for n in num_list[1::2]))