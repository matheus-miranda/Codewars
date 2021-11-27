fun accum(s: String): String {
    return s.mapIndexed { index, char -> char.uppercase() + char.lowercase().repeat(index) }
        .joinToString("-")
}
