fun accum(s: String): String {

    val stringList = s.toList()
    val sb = StringBuilder()

    stringList.forEachIndexed { index, c ->
        val firstChar = c.uppercaseChar()
        sb.append(firstChar)

        for (i in 1..index) {
            sb.append(c.lowercaseChar())
        }
        sb.append("-")
    }

    return sb.deleteCharAt(sb.length - 1).toString()
}