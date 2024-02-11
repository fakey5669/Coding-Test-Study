def solution(polynomial):
    # 일차 항과 상수항의 계수를 저장할 변수
    x_coefficient = 0
    constant = 0

    # 다항식을 항별로 분리
    terms = polynomial.split(" + ")

    for term in terms:
        # 일차 항 처리
        if 'x' in term:
            if term == 'x':
                x_coefficient += 1  # 계수 1 생략된 경우
            else:
                x_coefficient += int(term.replace('x', ''))  # 계수가 명시된 경우
        else:
            constant += int(term)  # 상수항 처리

    # 결과 문자열 조합
    result = []
    if x_coefficient != 0:  # 일차 항이 존재하면 결과에 추가
        if x_coefficient == 1:
            result.append('x')
        else:
            result.append(f'{x_coefficient}x')
    if constant != 0:  # 상수항이 존재하면 결과에 추가
        result.append(str(constant))

    # 최종 결과 문자열 반환
    return " + ".join(result) if result else '0'

# 예시
print(solution("2x + 3 + x"))  # "3x + 3"
print(solution("x + x + 1"))  # "2x + 1"
print(solution("3 + 7"))  # "10"
print(solution("x"))  # "x"