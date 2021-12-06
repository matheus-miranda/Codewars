fun printerError(s: String): String {
    val malfunctionCount = s.filter { it in 'n'..'z' }.count()
    return "$malfunctionCount/${s.length}"
}
