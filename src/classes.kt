/*class Patient {
    var name: String = "Unknown"
    var age: Int = 0
    var height: Double = 0.0
}

fun main() {
    val john = Patient()
    john.name = "John"
    john.age = 30
    john.height = 180.0

    val alice = Patient()
    alice.name = "Alice"
    alice.age = 22
    alice.height = 165.0

    println("${john.name}: ${john.age} yrs, ${john.height} cm")
    println("${alice.name}: ${alice.age} yrs, ${alice.height} cm")
}



class Rectangle(val width: Int, val height: Int)

fun printArea(rectangle: Rectangle) {
    println(rectangle.width * rectangle.height)
}

class Complex(var real: Double = 0.0, var image: Double = 0.0)


class Point3D {
    var x: Int = 0
    var y: Int = 0
    var z: Int = 0
}

fun createPoint(x: Int, y: Int, z: Int): Point3D {
    // provide implementation here
    val result = Point3D()
    result.x = x
    result.y = y
    result.z = z

    return  result
}
class OperatingSystem(var name: String = "Yuliya")
class DualBoot {
    var primaryOs = OperatingSystem()
    var secondaryOs = OperatingSystem()
}
fun main() {
    var result = DualBoot()
    println(result.secondaryOs)
}
fun max(a: Int, b: Int) = if (a > b) a else b

fun createFullName(firstName: String, lastName: String): String {
    var fullName = firstName + " " + lastName
    return fullName
}
fun main(){
    var inputName = readln()
    var inputLastName = readln()
    println(createFullName(inputName,inputLastName))
}
fun calculateDiscriminant(a: Double, b: Double, c: Double): Double {
    return b * b - 4 * a * c
}

fun calculateRoots(a: Double, b: Double, c: Double, discriminant: Double) {
    val x1 = (-b + discriminant.pow(0.5)) / (2 * a)
    val x2 = (-b - discriminant.pow(0.5)) / (2 * a)
    if (x1 == x2) {
        println("x = $x1")
    } else {
        println("x1 = $x1")
        println("x2 = $x2")
    }
}
fun main() {
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()

    val discriminant = calculateDiscriminant(a, b, c)

    if (discriminant < 0.0) {
        println("No real roots!")
    } else {
        calculateRoots(a, b, c, discriminant)
    }
}
fun subtractTwoNumbers(a: Long, b: Long){
    println(a - b)
}
fun sumTwoNumbers(a: Long, b: Long){
    println(a + b)
}
fun divideTwoNumbers(a: Long, b: Long){
    if (b != 0L) println(a.toInt() / b.toInt())
    else println("Division by 0!")
}
fun multiplyTwoNumbers(a: Long, b: Long){
    println(a * b)
}
fun main() {
    val (var1, op, var2) = readln().split(" ")
    when (op){
        "-" -> subtractTwoNumbers(var1.toLong(), var2.toLong())
        "+" -> sumTwoNumbers(var1.toLong(), var2.toLong())
        "/" -> divideTwoNumbers(var1.toLong(), var2.toLong())
        "*" -> multiplyTwoNumbers(var1.toLong(), var2.toLong())
        else -> println("unknown operation")
    }
}

fun f(x: Double): Double = when {
    x <= 0 -> f1(x)
    x >= 1 -> f3(x)
    else -> f2(x)
}
fun f1(x:Double):Double = x * x + 1

fun f2(x:Double):Double = 1/(x * x)

fun f3(x:Double):Double = x * x - 1

fun main(){
    var t = readln().toDouble()
    print(f(t))
}

fun passwordLessThan5(): String {
    println("Your password should be longer than five characters, please write a new password")
    val newPassword = readln()
    return newPassword
}

fun passwordLongerThan5(password: String) {
    println("Your password is correct, please enter your name")
    val name = readln()
    println("Congratulations! Password for $name is $password")
}
fun main() {
    var password = readln()
    if (password.length < 5) {
        passwordLessThan5()
    } else {
        passwordLongerThan5(password)
    }
}

fun polynomial(x: Int, c: Int, b: Int, a: Int): Int {
    return x+c+b+a
}
fun getVolume(length: Int = 1, width: Int = 1, height: Int = 1): Int {
    return length * width * height
}
fun concatenate(var1: String, var2: String, var3 : String, sep: String = " "): String{
    return var1 + sep + var2 + sep + var3
}


fun sum5(a1: Int = 0, a2: Int = 0, a3: Int = 0, a4: Int = 0, a5: Int = 0): Int{
    return a1 + a2 + a3 + a4 + a5
}
// complete this function
fun greetings(name: String = "secret user"): String = "Hello, $name!"

fun url(host: String = "localhost", port: Int = 443): String {
    return "https://"+ host +":"+ port
}

import kotlin.math.hypot
fun perimeter(
    x1: Double,
    y1: Double,
    x2: Double = x1,
    y2: Double = y1,
    x3: Double = x2,
    y3: Double = y2,
    x4: Double = x3,
    y4: Double = y3
): Double {
    var p: Double
    p = hypot(x2 - x1, y2 - y1) + hypot(x3 - x2, y3 - y2) + hypot(x4 - x3, y4 - y3) + hypot(x4 - x1, y4 - y1)
    return p
}

const val SPEED = 60
fun checkLimit(mySpeed: Int, limitSpeed: String): String {
    var str = ""
    var myLimit = 0
    if (limitSpeed == "no limit") {
        myLimit = SPEED
    } else myLimit = limitSpeed.toInt()
    if (mySpeed <= myLimit) {
        str = "Within the limit"
    } else str = "Exceeds the limit by ${mySpeed - myLimit} kilometers per hour"
    return str
}

fun main(args: Array<String>) {
    val var1 = readln().toInt()
    val var2 = readln()
    println(checkLimit(mySpeed = var1, limitSpeed = var2))
}

fun greetUser(
    name: String,
    admin: Boolean = false,
    smith: Boolean = false,
    honorific: String = "",
    greet: String = "Greetings"
): String {
    return if (!admin && !smith) {
        "$greet, $honorific $name"
    } else {
        "Matrix Error"
    }
}
// do not change lines above

fun main(){
    print(greetUser(name = "Anderson", honorific = "Mr.", greet = "Hello" ))
}


// complete this function, add default values


fun carPrice(old: Int = 5, kilometers: Int = 100000, maximumSpeed: Int = 120, automatic: Boolean = false){
    var price = 20000
    if (automatic) price += 1500
    if (old != 0) price += (0 - old)  * 2000
    if (kilometers != 0 ) price -= kilometers/10000 * 200
    if (maximumSpeed != 120) price += (maximumSpeed - 120) * 100
    println(price)
}
fun main(){
    val (myOld, myKm, mySpeed, auto) = readln().split(" ")
    carPrice(myOld.toInt(), myKm.toInt(), mySpeed.toInt(), auto.toBoolean())
}

import  kotlin.math.pow
import kotlin.math.roundToInt
import kotlin.math.roundToLong

fun finalAmount(amount: Int = 1000, percent: Int = 5, years: Int = 10 ): Int {
    var fAmount1: Double
    fAmount1 = (1 + percent.toDouble() / 100)
    return (fAmount1.pow(years) * amount).toInt()

}

fun main() {
    var input1 = readln()
    var input2 = readln().toInt()
    println(
        when (input1){
        "amount" -> finalAmount(amount = input2)
        "percent" -> finalAmount(percent = input2)
        "years" -> finalAmount(years = input2)
            else -> println("unknown operation")
    }
    )
}
class Size(_width: Int, _height: Int) {
    var width: Int = 0
    var height: Int = 0

    init {
        width = if (_width >= 0) _width else {
            println("Error, the width should be a non-negative value")
            0
        }
        height = if (_height >= 0) _height else {
            println("Error, the height should be a non-negative value")
            0
        }
    }
}

data class Site(
    val address: String = "reddit.com",
    val foundationYear: Int = 2005
)

fun makeReddit() = Site()



fun main(){
    var result: Site = makeReddit();

   print("${result.address} ${result.foundationYear}")
}
class Point2D( x: Int, y: Int)

fun main() {
    val timerValue = readLine()!!.toInt()
    val timer = ByteTimer(timerValue)
    println(timer.time)
}

class ByteTimer(var time: Int) {
    init{
        if (time < -128)
            time = -128
        else if (time > 127)
            time = 127
        else
            time = time
    }
}

class Pet(var name: String, var animal: String = "cat", var owner: String)

class Person(_firstName: String, _lastName: String, _age: String) {
    var firstName: String = _firstName
    var lastName: String = _lastName
    var age: Int = _age
}
class Route(startPoint: Int = 0, finishPoint: Int) {
    val distance = finishPoint - startPoint
}
class Worker(position: String, initialSalary: Int) {
    val position = position
    var salary = initialSalary
    init {
        if (position == "head of department") salary *= 2
    }
}
 class BankAccount(var _deposited : Long, var _withdrawn : Long) {
     var deposited = _deposited
     var withdrawn = _withdrawn
     var balance = deposited - withdrawn
 }
class Application(val name: String) {
    fun run(var1: String, var2: String, var3: String){
        println(name)
        println(var1)
        println(var2)
        println(var3)
    }
}
class Application(val name: String) {

    fun run(a: String, b: String, c: String) {
        val argList = listOf<String>(this.name, a, b, c)
        repeat(argList.size) {
            println(argList[it])
        }
    }
}
class Counter(var value: Int) {

    fun increment() {
        ++value
    }
}
fun main(){
    val counter = Counter()

    val counter = Counter(1)

    Counter().increment()

    Counter().increment(1)

    Counter(1).increment()

    Counter(1).increment(1)
}
class Box(var height: Double, var width: Double, var length: Double) {
    fun getVolume() {
        var num = (height * width * length) * 2
    }
    // write the getVolume method here
}

class Car(val make: String, val year: Int) {
    private var speed : Int = 0
    fun accelerate() {
        speed += 5
    }
    fun decelerate() {
        speed -= 5
        if (speed < 0) speed = 0
    }
    // write the methods here
}
class ArithmeticOperations(var x: Int, var y: Int) {
    fun addition(): Int {
        return x + y
    }
    fun subtraction(): Int {
        return x - y
    }
    fun multiplication(): Int {
        return  x * y
    }
    fun division(): Float {
        return x.toFloat() / y
    }
}

    enum class DangerLevel(val num: Int) {
        HIGH(3),
        MEDIUM(2),
        LOW(1);

        fun getLevel(): Int {
            return num
        }
    }
    fun main() {
        val high = DangerLevel.HIGH
        val medium = DangerLevel.MEDIUM

        println(DangerLevel.valueOf("HIGh")) // true
    }
enum class Currency(val country: String){
    USR("is United States dollar"),
    EUR("is Euro"),
    GBP("is Pound sterling"),
    RUB("is Russian ruble"),
    UAH("is Ukrainian hryvnia"),
    KZT("is Kazakhstani tenge"),
    CAD("is Canadian dollar"),
    JPY("is Japanese yen"),
    CNY("is Chinese yuan");

}


enum class DaysOfTheWeek() {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

fun main() {
    var day : DaysOfTheWeek
    var myList = DaysOfTheWeek.values()
    println(myList.joinToString(" "))
   // myList.forEach(System.out::println)
    for (enum in DaysOfTheWeek.values()) {
        println(enum)
    }
}

enum class Rainbow(val color: String, val rgb: String) {
    RED("Red", "#FF0000"),
    ORANGE("Orange", "#FF7F00"),
    YELLOW("Yellow", "#FFFF00"),
    GREEN("Green", "#00FF00"),
    BLUE("Blue", "#0000FF"),
    INDIGO("Indigo", "#4B0082"),
    VIOLET("Violet", "#8B00FF"),
    NULL("", "");

}
public fun isRainbow(color: String): Boolean {
    for (enum in Rainbow.values()) {
        if (color.toUpperCase() == enum.name) return true
    }
    return false
}
fun main() {
    val input = readln()
    println(isRainbow(input))

}

enum class Country(val Currency: String){
    GERMANY("Euro"),
    MALI("CFA franc"),
    DOMINICA("Eastern Caribbean dollar"),
    CANADA("Canadian dollar"),
    SPAIN("Euro"),
    AUSTRALIA("Australian dollar"),
    BRAZIL("Brazilian real"),
    SENEGAL("CFA franc"),
    FRANCE("Euro"),
    GRENADA("Eastern Caribbean dollar"),
    LATVIA("Latvian lat"),
    KIRIBATI("Australian dollar"),
    NULL("NULL");

}
fun isCountry(country: String) : Boolean {
    for (enum in Country.values()) {
        if (country.uppercase() == enum.name) return true
    }
    return false
}
fun main() {
    val (var1, var2) = readln().split(" ")
    var rezult: Boolean = false
    if (isCountry(var1) && isCountry(var2)) {
        rezult = Country.valueOf(var1.uppercase()).Currency == Country.valueOf(var2.uppercase()).Currency
        println(rezult)
    } else println("Error input")
}


enum class Rainbow(val color: String, val rgb: String) {
    RED("Red", "#FF0000"),
    ORANGE("Orange", "#FF7F00"),
    YELLOW("Yellow", "#FFFF00"),
    GREEN("Green", "#00FF00"),
    BLUE("Blue", "#0000FF"),
    INDIGO("Indigo", "#4B0082"),
    VIOLET("Violet", "#8B00FF"),
    NULL("", "");

}
fun isRainbow(color: String) : Boolean {
    for (enum in Rainbow.values()) {
        if (color.uppercase() == enum.name) return true
    }
    return false
}
fun main() {
    val color = readln()
    if (isRainbow(color.uppercase())) println(Rainbow.valueOf(color.uppercase()).ordinal + 1)
    else println("Error input")
    // put your code here
    class Client {
        var name: String = "Unknown"
        var age: Int = 18
        val info: String
            get() {
                return "name = $name, age = $age"
            }
    }

    val client = Client()
    println(client.info) // name = Unknown, age = 18
    client.name = "Lester"
    client.age = 20
    println(client.info) // name = Lester, age = 20
}
class Client {
    var name = "Unknown"
    var age = 18
        set(value) {
            field = if (value < 0) {
                println("Age cannot be negative. Set to $defaultAge")
                defaultAge
            } else
                value
        }
    val defaultAge = 18
}

val client = Client()
client.age = -1      // Age cannot be negative. Set to 18.
println(client.age)  // 18

class LewisCarrollBook(){
    var name = ""
        set(value) {
            println("The name of the book is \n" +
                    "Now, a book called $field")
            field = value
        }
    var author = "Lewis Carroll"
        set(value) {
            println("The author of the book is $field")
            field = value
        }
    var price = 0
        set(value) {
            println("Putting a new price...")
            println("The new price is $field")
            field = value
        }

}

class LewisCarrollBook {
    var name = ""
        get(){
            println("The name of the book is $field")
            return  field
        }
        set (value) {
            println("Now, a book called $value")
           // println("The name of the book is $field")
            field = value
        }
    var author = "Lewis Carroll"
        get() {
            println("The author of the book is $field")
            return field
        }
    var price: Int = 0
        get() {
            println("Putting a new price...")
            return field
        }
        set(value) {
            println("The new price is $value")
            field = value
        }
}
fun main() {
    val lewisCarrollBook = LewisCarrollBook()
    var bookName = lewisCarrollBook.name //get
    lewisCarrollBook.name = "Alice's Adventures in Wonderland" //set
    bookName = lewisCarrollBook.name //get
    var authorName = lewisCarrollBook.author //get
    var bookPrice = lewisCarrollBook.price //get
    lewisCarrollBook.price = 1500 //set
}

class City(val name: String) {
    var population: Int = 0
        set (value){
            field = if (value > 5_000_000) 5_000_000 else
                if (value < 0) 0
                else value
        }

}

const val MIN = -92
const val MAX = 57
const val DUBAIMED = 30
const val MOSCOWMED = 5
const val HANOIMED = 20

const val DUBAI = "Dubai"
const val MOSCOW = "Moscow"
const val HANOI = "Hanoi"

fun check(num: Int): Boolean {
    return num < MIN || num > MAX
}
data class City(val name: String) {
    var degrees: Int = 0
        set(value) {
            if (check(value)) {
                field = when (name) {
                    DUBAI -> DUBAIMED
                    MOSCOW -> MOSCOWMED
                    HANOI -> HANOIMED
                    else -> 0
                }
            } else field = value
        }
}

fun checkMin(num1: Int, num2: Int, num3: Int): String {
    return when {
        num1 < num2 && num1 < num3 -> DUBAI
        num2 < num1 && num2 < num3 -> MOSCOW
        num1 == num2 || num2 == num3 || num1 == num3 -> "neither"
        else -> HANOI
    }
}
fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City(DUBAI)
    firstCity.degrees = first
    val secondCity = City(MOSCOW)
    secondCity.degrees = second
    val thirdCity = City(HANOI)
    thirdCity.degrees = third
    println(checkMin(firstCity.degrees, secondCity.degrees, thirdCity.degrees))
}
*/
var waterBalance = 400
var milkBalance = 540
var beansBalanc = 120
var cupsBalance = 9
var monyBalance = 550

fun buy(){
    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")

    var diffWaterBalance  = 0
    var diffMilkBalance = 0
    var diffBeansBalance  = 0
    var diffCupsBalance  = 0
    var diffMonyBalance  = 0


    when (readln()) {
        "1" -> {
            diffWaterBalance = -250
            diffBeansBalance = -16
            diffCupsBalance = -1
            diffMonyBalance = +4
        }

        "2" -> {
            diffWaterBalance = -350
            diffMilkBalance = -75
            diffBeansBalance = -20
            diffCupsBalance = -1
            diffMonyBalance += 7
        }

        "3" -> {
            diffWaterBalance -= 200
            diffMilkBalance -= 100
            diffBeansBalance -= 12
            diffCupsBalance -= 1
            diffMonyBalance += 6
        }
        "back" -> {
            return
        }
    }

    when(true) {
        waterBalance + diffWaterBalance < 0 -> println("Sorry, not enough water!")
        milkBalance + diffMilkBalance < 0 -> println("Sorry, not enough milk")
        beansBalanc + diffBeansBalance <0 -> println("Sorry, not enough beans")
        cupsBalance + diffCupsBalance < 0 -> println("Sorry, not enough cups")
        else -> {
            waterBalance += diffWaterBalance
            milkBalance += diffMilkBalance
            beansBalanc += diffBeansBalance
            cupsBalance += diffCupsBalance
            monyBalance += diffMonyBalance

            println("I have enough resources, making you a coffee!")
        }
    }

    println()
}

fun fill() {
    println("Write how many ml of water you want to add:")
    waterBalance += readln().toInt()
    println("Write how many ml of milk you want to add:")
    milkBalance += readln().toInt()
    println("Write how many grams of coffee beans you want to add:")
    beansBalanc += readln().toInt()
    println("Write how many disposable cups you want to add: ")
    cupsBalance += readln().toInt()

    println()
}
fun take() {
    println("I gave you \$$monyBalance ")
    monyBalance = 0
}
fun remaining(){
    println(
        "The coffee machine has:\n" +
                "$waterBalance ml of water\n" +
                "$milkBalance ml of milk\n" +
                "$beansBalanc g of coffee beans\n" +
                "$cupsBalance disposable cups\n" +
                "\$$monyBalance of money"
    )

    println()
}

fun main() {
    var input = ""
    while(input != "exit") {
        println("Write action (buy, fill, take, remaining, exit):")
        input = readln()
        println()
        when (input) {
            "buy" -> buy()
            "fill" -> fill()
            "take" -> take()
            "remaining" -> remaining()
        }
    }
}



