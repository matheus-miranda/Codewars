fun printerError(s: String): String {
    val range = 'n'..'z'
    var malfunctionCounter = 0

    s.forEach { letter ->
        if (letter in range) {
            malfunctionCounter++
        }
    }

    return "$malfunctionCounter/${s.length}"
}