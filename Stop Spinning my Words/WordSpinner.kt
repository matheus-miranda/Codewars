fun spinWords(sentence: String): String {
    val sb = StringBuilder()
    sentence.split(" ").forEach {
        if (it.length >= 5) {
            sb.append(it.reversed()).append(" ")
        } else {
            sb.append(it).append(" ")
        }
    }
    return sb.toString().dropLast(1)
}