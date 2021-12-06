fun printerError(s: String): String = "${s.count { it in 'n'..'z' }}/${s.length}"
