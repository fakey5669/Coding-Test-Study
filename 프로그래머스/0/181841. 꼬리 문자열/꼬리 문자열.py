def solution(str_list, ex):
    return "".join(s for s in str_list if not ex in s)