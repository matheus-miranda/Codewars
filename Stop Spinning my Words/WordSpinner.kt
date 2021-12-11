fun spinWords(sentence: String): String = sentence.split(" ").joinToString(" ") { if (it.length > 4) it.reversed() else it }
