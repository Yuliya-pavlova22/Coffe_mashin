
/*const val WATER = 200
const val MILK = 50
const val BEANS = 15

private fun greetings() {
    println("Starting to make a coffee\n" +
            "Grinding coffee beans\n" +
            "Boiling water\n" +
            "Mixing boiled water with crushed coffee beans\n" +
            "Pouring coffee into the cup\n" +
            "Pouring some milk into the cup\n" +
            "Coffee is ready!")
}
private  fun cupsAvailableWater(waterBalance: Int): Int{
    val AvailableWater = waterBalance / WATER
    return AvailableWater
}
private  fun cupsAvailableMilk(milkBalance: Int): Int{
    val AvailableMilk = milkBalance / MILK
    return AvailableMilk
}

private  fun cupsAvailableBeans(BeansBalance: Int): Int{
    val AvailableBeans = BeansBalance / BEANS
    return AvailableBeans
}

private fun balanceСheck() {
    println("Write how many ml of water the coffee machine has:")
    val waterBalance = readln().toInt()
    println("Write how many ml of milk the coffee machine has:")
    val milkBalance = readln().toInt()
    println("Write how many grams of coffee beans the coffee machine has:")
    val beansBalance = readln().toInt()
    println("Write how many cups of coffee you will need:")
    val cupsInput = readln().toInt()

    val minAvailableCups = minOf(cupsAvailableWater(waterBalance), cupsAvailableMilk(milkBalance), cupsAvailableBeans(beansBalance))
    if (cupsInput > minAvailableCups) println("No, I can make only $minAvailableCups cups of coffee")
    else {
        if (cupsInput == minAvailableCups) println("Yes, I can make that amount of coffee")
        else println("Yes, I can make that amount of coffee (and even ${minAvailableCups - cupsInput } more than that)")
    }
}*/
package machine
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



