package ikergc.kotlinbeginners

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //variablesyConstantes()
        //tipoDeDatos()
        //sentenciaIf()
        //sentenciaWhen()
        //arrays()
        //maps()
        //loops()
        //nullSafety()
        //funciones()
        classes()
    }

    private fun variablesyConstantes(){


        // Variables (Se puede cambiar el valor pero al mismo tipo de dato)
        var myVariable = "Hello Iker"
        var myFirstNumber = 1
        println(myVariable)
        println(myFirstNumber)

        myVariable = "Bienvenidos a IkerWeb"
        println(myVariable)

        var mySecondVariable = "Subscribete"
        println(mySecondVariable)

        mySecondVariable = myVariable

        myVariable = "Ya te has subscrito? "
        println(myVariable)


        // Constantes (No se puede cambiar el valor una vez declarada)

        val myConstant = "Te ha gustado el tutorial?"
        val mySecondConstant = myConstant
        println(mySecondVariable)
    }

    private fun tipoDeDatos(){

        // Tipos de datos (data types)

        // String

        val myString : String = "Hola Iker"
        val myString2 = "Adios Iker"
        val myString3 = myString + " " + myString2
        println(myString3)

        // Enteros (Byte, Shot, Int, Long)

        val myInt : Int = 1
        val myInt2 = 2
        val myInt3 = myInt + myInt2
        println(myInt3)


        // Decimales (Float, Double)

        val myFloat : Float = 1.5f
        val myDouble : Double = 1.5
        val myDouble2 = 2.5
        val myDouble3 = 1
        val myDouble4 = myDouble + myDouble2 + myDouble3
        println(myDouble4)

        // Boolean (Boolean)

        val myBool : Boolean = true
        val myBool2 = false
        println(myBool == myBool2)
        println(myBool && myBool2)
    }

    private fun sentenciaIf(){

        val myNumber = 10

        // Operadores condiciones
        // > mayor que
        // < menor que
        // >= mayor o igual que
        // <= menor o igual que
        // == igual que
        // != desigualdad

        // Operadores logicos
        // && operador "y"
        // || operador "o"
        // ! operador "no"


        if ((myNumber <= 10 && myNumber > 5)|| myNumber == 53 ) {
            println("$myNumber es menor o igual que 10 o es igual a 53")
        }else if (myNumber == 60 ){
            println("$myNumber es igual a 60")
        }else if (myNumber != 70 ){
            println("$myNumber no es igual a 70")
        }
        else {
            println("$myNumber es mayor que 10 o menor o igual que 5 y no es igual a 53")
        }
    }
    // When (Switch)

    fun sentenciaWhen (){

        val country = "España"

        when (country) {
            "España", "Mexico", "Peru", "Colombia", "Argentina" -> {
                println("El idioma es Español")
            } "EEUU" -> {
            println("El idioma es Ingles")
        } "Francia" -> {
            println("El idioma es Frances")
        } else -> {
            println("No conocemos el idioma")
        }
        }

        // When con Int
        val age = 1000

        when (age){
            0, 1, 2 -> {
                println("Eres un bebe")
            } in 3..10  -> {
            println("Eres un niño")
        } in 11..17 -> {
            println("Eres adolecente")
        }  in 18..69 -> {
            println("Eres adulto")
        }  in 70..99 -> {
            println("Eres anciano")
        } else -> {
            println("\uD83D\uDE31")
        }
        }
    }

    fun arrays () {

        val name = "Iker"
        val surname = "Gonzalez"
        val company = "GOCA"
        val age = "18"

        // Creacion array

        val myArray = arrayListOf<String>()

        // Añadir datos de uno en uno (permite repetidos)

        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)
        //myArray.add(age)

        println(myArray)

        // Añadir conjunto de datos

        myArray.addAll(listOf("hola", "bienvenidos al tutorial"))
        println(myArray)

        // Acceso a datos

        val myCompany = myArray[2]
        println(myCompany)

        // Modificar datos

        myArray [5] = "Suscribete y activa la campana"

        // Eliminar datos

        myArray.removeAt(4)
        println(myArray)

        // Recorrer datos de uno en uno

        myArray.forEach {
            println(it)
        }

        // Otras operaciones

        // contar cuantos elementos hay en la array
        println(myArray.count())

        // borrar todos los elementos del array
        myArray.clear()
        println(myArray.count())

        // acceder primer y ultimo elemento
        myArray.first()
        myArray.last()

        // ordenar
        myArray.sort()
    }

    fun maps() {

        var myMap: Map<String, Int> = mapOf()
        println(myMap)

        // Añadir elementos
        myMap = mutableMapOf("Iker" to 1, "Pedro" to 2, "Sara" to 5)
        //myMap = mapOf("Iker" to 1, "Pedro" to 2, "Sara" to 5)
        println(myMap)


        // Añadir un solo valor
        myMap["Ana"] = 7
        myMap.put("Maria",8)
        println(myMap)

        // Actualizacion de datos
        myMap.put("Iker",3)
        println(myMap)
        myMap.put("Iker",4)
        println(myMap)

        // Acceder a datos
        println(myMap["Iker"])

        // Eliminar un dato
        myMap.remove("Iker")
        println(myMap)
    }

    private fun loops() {

        val myArray: List<String> = listOf("Hola", "Bienvenidos al tutorial", "Suscribete")
        val myMap: MutableMap<String, Int> = mutableMapOf("Iker" to 1, "Pedro" to 2, "Sara" to 5)

        // For

        for (myString in myArray) {
            println(myString)
        }

        for (myElement in myMap) {
            println(("${myElement.key}-${myElement.value}"))
        }

        for (x in 0..10) {
            println(x)
        }

        for (x in 9 until 30) {
            println(x)
        }

        for (x in 0..10 step 2) {}


        for (x in 10 downTo 0 step 3) {}

        val myNumericArray = (0..20)
        for (myNum in myNumericArray) {
            println(myNum)
        }

        // While

        var x = 0

        while (x < 10) {
            println(x)
            x += 2
            //x++
        }
    }

    fun nullSafety() {

        var myString = "Iker"
        // myString = null  Esto daria error de compilacion
        println(myString)

        // Variable null safety
        var mySafetyString: String? = "Iker null safety"
        mySafetyString = null
        println(mySafetyString)

        mySafetyString = "Subscribete"
        //println(mySafetyString)

        /*if (mySafetyString != null) {
            println(mySafetyString!!)
        } else {
            println(mySafetyString)
        }*/

        // Safe call
        println(mySafetyString?.length)

        mySafetyString?.let {
            println(it)
        } ?: run {
            println(mySafetyString)
        }
    }

    fun funciones() {

        sayHello()
        sayHello()
        sayHello()

        sayMyName(name = "Iker")
        sayMyName(name = "Pedro")
        sayMyName(name = "Sara")

        sayMyNameAndAge(name = "Iker", age = 12)

        val sumResult = sumTwoNumbers(10, 5)
        println(sumResult)

        println(sumTwoNumbers(15, 5))

        println(sumTwoNumbers(10, sumTwoNumbers(5, 5)))
    }

    // Funcion simple
    fun sayHello() {
        println("Hola")
    }

    // Funcion con parametro de entrada
    fun sayMyName(name: String){
        println("Hola mi nombre es $name" )
    }

    // Funcion con mas de un parametro de entrada
    fun sayMyNameAndAge(name: String, age: Int){
        println("Hola mi nombre es $name y mi edad es $age" )
    }

    // Funcion con un valor de retorno
    fun sumTwoNumbers(firstNumber : Int, secondNumber : Int) : Int {
        val sum = firstNumber + secondNumber
        return sum
    }

    fun classes() {

        // val iker = Programmer("iker", 19, arrayOf("Kotlin", "Java", "Swift", "MYSQL"))
        val iker = Programmer("iker", 19, arrayOf(Programmer.Lenguage.KOTLIN,
            Programmer.Lenguage.JAVA,
            Programmer.Lenguage.SWIFT,
            Programmer.Lenguage.MYSQL))
        println(iker.name)

        iker.age = 40
        iker.code()

        // val isabella = Programmer("isabella", 18, arrayOf("Java", "Swift"))
        val isabella = Programmer("isabella", 18, arrayOf(Programmer.Lenguage.SWIFT,
            Programmer.Lenguage.JAVA), arrayOf(iker))
        isabella.code()

        println("${isabella.friends?.first()?.name} es amigo de ${isabella.name}")
    }
}
