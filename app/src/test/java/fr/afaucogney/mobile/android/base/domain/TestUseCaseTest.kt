package fr.afaucogney.mobile.android.base.domain

import org.junit.Assert.assertEquals
import org.junit.Test

class TestUseCaseTest {

    @Test
    fun execute() {
        assertEquals(TestUseCase().execute("YES"), 10)
        assertEquals(TestUseCase().execute("NO"), 0)
        assertEquals(TestUseCase().execute("N"), -1)
    }
}