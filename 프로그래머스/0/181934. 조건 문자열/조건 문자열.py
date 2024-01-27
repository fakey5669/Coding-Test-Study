def solution(ineq, eq, n, m):
    return int((ineq == ">" and ((eq == "=" and n >= m) or (eq == "!" and n > m))) or
               (ineq == "<" and ((eq == "=" and n <= m) or (eq == "!" and n < m))))