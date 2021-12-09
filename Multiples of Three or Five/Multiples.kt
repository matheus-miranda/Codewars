fun solution(number: Int): Int {
    val multiples = mutableListOf(0)

    if (number > 0) {
        for (i in 1 until number) {
            if (i % 3 == 0 || i % 5 == 0) {
                multiples.add(i)
            }
        }
    }

    return multiples.sum()
}