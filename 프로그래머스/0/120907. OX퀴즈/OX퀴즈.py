def solution(quiz):
    result = []

    for q in quiz:
        parts = q.split()
        X, operator, Y, _, Z = parts

        if operator == '+':
            correct = int(X) + int(Y) == int(Z)
        elif operator == '-':
            correct = int(X) - int(Y) == int(Z)

        result.append("O" if correct else "X")

    return result