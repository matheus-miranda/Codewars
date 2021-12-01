fun bouncingBall(h: Double, bounce: Double, window: Double): Int {
    if (h <= 0) return -1
    if (!(bounce > 0 && bounce < 1)) return -1
    if (window >= h) return -1

    var counter = 1 // Ball will be seen from the window at least once
    var bounceHeight = bounce * h

    while (bounceHeight > window) {
        counter += 2
        bounceHeight *= bounce
    }

    return counter
}