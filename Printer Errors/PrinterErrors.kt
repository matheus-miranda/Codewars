fun printerError(s: String): String {
    val malfunctionCount = s.count { it in 'n'..'z' }
    return "$malfunctionCount/${s.length}"
}
