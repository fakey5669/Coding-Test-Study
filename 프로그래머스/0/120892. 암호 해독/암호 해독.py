def solution(cipher, code):
    return "".join(s for s in cipher[code-1::code])