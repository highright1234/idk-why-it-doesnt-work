
val listeners1 = ArrayList<TestAsdf<*>.() -> Unit>()

fun main(args : Array<String>) {
    createListener<String>(String::class.java) {

    }
    println(listeners1[0]::class.java.declaredMethods[0].parameterTypes[0]) // It must be string but not
    println(listeners1[0].toString())
}

fun <T> createListener(
    clazz : Class<T>,
    asdf : TestAsdfAsdf<out T>.() -> Unit
) {
    @Suppress("UNCHECKED_CAST")
    println(clazz)
    listeners1 += asdf as TestAsdf<*>.() -> Unit
}