def solution(arr1, arr2):
    sum1=sum(arr1)
    sum2=sum(arr2)
    if len(arr1)>len(arr2):
        return 1
    elif len(arr1)<len(arr2):
        return -1
    elif len(arr1)==len(arr2) and sum1>sum2:
        return 1
    elif len(arr1)==len(arr2) and sum1<sum2:
        return -1
    elif len(arr1)==len(arr2) and sum1==sum2:
        return 0
        