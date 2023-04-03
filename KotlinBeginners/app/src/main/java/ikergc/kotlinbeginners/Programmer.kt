package ikergc.kotlinbeginners

class Programmer(var name: String,
                 var age: Int,
                 var lenguages: Array <Lenguage>,
                 val friends: Array<Programmer>? = null) {

    enum class Lenguage {
        KOTLIN,
        SWIFT,
        JAVA,
        MYSQL,
        JAVASCRIPT
    }

    fun code() {
        for (lenguages in lenguages)
            println("Estoy programando en $lenguages")
    }
}