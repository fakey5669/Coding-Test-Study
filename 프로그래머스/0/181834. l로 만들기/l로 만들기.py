def solution(myString):
    return "".join('l' if 'l'>s else s for s in myString)