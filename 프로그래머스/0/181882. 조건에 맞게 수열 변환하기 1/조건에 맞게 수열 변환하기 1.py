def solution(arr):
    for idx, number in enumerate(arr):
        if number>=50 and number%2==0: arr[idx]/=2
        elif number<50 and number%2!=0: arr[idx]*=2 
    return arr