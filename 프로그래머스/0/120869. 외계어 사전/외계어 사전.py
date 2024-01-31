from itertools import permutations

def solution(spell, dic):
    spell_permutations = [''.join(p) for p in permutations(spell)]

    return 1 if any(word in dic for word in spell_permutations) else 2