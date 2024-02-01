def solution(polynomial):
    # 항의 계수를 저장할 변수 초기화
    x_coefficient = 0
    constant = 0

    # 다항식을 항별로 분리
    terms = polynomial.split(" + ")

    for term in terms:
        # 일차 항 처리
        if 'x' in term:
            if term == 'x':  # 계수가 생략된 경우
                x_coefficient += 1
            else:  # 계수가 명시된 경우
                x_coefficient += int(term[:-1])
        # 상수항 처리
        else:
            constant += int(term)

    # 결과 문자열 생성
    result = []
    if x_coefficient > 1:
        result.append(f"{x_coefficient}x")
    elif x_coefficient == 1:
        result.append("x")
    
    if constant > 0:
        result.append(str(constant))
    
    # 결과 문자열 반환
    return " + ".join(result) if result else "0"