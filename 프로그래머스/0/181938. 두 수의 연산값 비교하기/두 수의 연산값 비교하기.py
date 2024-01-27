def solution(a, b):
    return int(f'{str(a)}{str(b)}') if int(f'{str(a)}{str(b)}') >= 2*a*b else 2*a*b 