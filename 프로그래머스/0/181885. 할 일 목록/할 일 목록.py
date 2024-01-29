def solution(todo_list, finished):
    return [n for n, is_finished in zip(todo_list, finished) if not is_finished]