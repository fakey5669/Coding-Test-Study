def solution(arr, intervals):
    answer = []
    arr1 = [arr[n] for n in range(intervals[0][0], intervals[0][1]+1)]
    arr2 = [arr[n] for n in range(intervals[1][0], intervals[1][1]+1)]
    return arr1+arr2