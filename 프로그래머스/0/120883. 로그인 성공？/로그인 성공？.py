def solution(id_pw, db):
    for i,p in db:
        if i == id_pw[0] and p == id_pw[1]:
            return 'login'

        if i == id_pw[0]:
            return 'wrong pw'

    return 'fail'