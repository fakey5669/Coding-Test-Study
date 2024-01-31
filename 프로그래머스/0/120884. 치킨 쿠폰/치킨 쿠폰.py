def solution(chicken):
    output = 0

    while chicken >= 10:
        output += chicken // 10
        chicken = chicken // 10 + chicken % 10

    return output