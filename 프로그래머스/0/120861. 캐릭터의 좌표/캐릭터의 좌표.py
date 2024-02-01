def solution(keyinput, board):
    answer = [0, 0]
    for s in keyinput:
        if s == 'up':
            if answer[1] == (board[1]-1)//2:
                continue
            answer[1] += 1
        elif s == 'down':
            if answer[1] == -((board[1]-1)//2):
                continue
            answer[1] -= 1
        elif s == 'left':
            if answer[0] == -((board[0]-1)//2):
                continue
            answer[0] -= 1
        elif s == 'right':
            if answer[0] == (board[0]-1)//2:
                continue
            answer[0] += 1
    return answer