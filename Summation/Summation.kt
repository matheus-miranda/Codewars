import org.junit.Assert.assertEquals
import org.junit.Test

object GrassHopper {
    fun summation(n: Int) = (1..n).sum()
}

class GrassHopperTest {
    @Test
    fun test1() {
        assertEquals(1, GrassHopper.summation(1))
    }
    @Test
    fun test2() {
        assertEquals(36, GrassHopper.summation(8))
    }
}
