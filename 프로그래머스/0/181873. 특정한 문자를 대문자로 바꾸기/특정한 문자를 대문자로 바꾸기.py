def solution(my_string, alp):
    return "".join(s if not s==alp else s.upper() for s in my_string)