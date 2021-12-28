package example

import dagger.Component
import javax.inject.Inject

fun main(args: Array<String>) {
    val core = Core()
    DaggerCoreComponent.create().inject(core)
    core.hello("Dagger")
}

@Component
interface CoreComponent {
    fun inject(core: Core);
}

class Core {
    @Inject
    lateinit var util: Util
    fun hello(name: String) {
        println("Hello, ${util.toUpper(name)}!")
    }
}

class Util @Inject constructor() {
    fun toUpper(s: String) = s.uppercase();
}