fun evaporator(content: Double, evap_per_day: Double, threshold: Double): Int {

    var newContent = content
    var days = 0

    while (newContent > (threshold / 100) * content) {
        val percentLost = newContent * (evap_per_day / 100)
        newContent -= percentLost
        days++
    }

    return days
}