package example

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HelloTest {

    @Test
    fun `hello returns greeting words`() {
        assertThat(hello("you")).isEqualTo("Hello, you!")
    }

}