import kotlin.test.assertEquals
import org.junit.Test

fun encode(num: Int): String {
    val numbers = linkedMapOf(
        1000 to "M",
        900 to "CM",
        500 to "D",
        400 to "CD",
        100 to "C",
        90 to "XC",
        50 to "L",
        40 to "XL",
        10 to "X",
        9 to "IX",
        5 to "V",
        4 to "IV",
        1 to "I"
    )

    for (i in numbers.keys) {
        if (num >= i) {
            return numbers[i] + encode(num - i)
        }
    }

    return ""
}

class TestEncode {
    @Test
    fun basic() {
        assertEquals("", encode(0))
        assertEquals("I", encode(1))
        assertEquals("XXI", encode(21))
        assertEquals("MMVIII", encode(2008))
        assertEquals("MDCLXVI", encode(1666))
    }
}
