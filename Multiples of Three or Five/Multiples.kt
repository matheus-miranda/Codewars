fun solution(number: Int): Int = (1 until number).filter { it % 3 == 0 || it % 5 == 0 }.sum()
