def solution(num_list):
    odd = int("".join(str(n) for n in num_list if n%2!=0))
    even = int("".join(str(n) for n in num_list if n%2==0))
    return odd+even