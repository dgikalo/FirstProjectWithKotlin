package org.example


fun main() {
    println("Earned amount:")
    val productsSold = mapOf<String, Int>(
        "Bubblegum" to 202,
        "Toffee" to 118,
        "Ice cream" to 2250,
        "Milk chocolate" to 1680,
        "Doughnut" to 1075,
        "Pancake" to 80
    )

    var totalIncome = 0

    for (entry: Map.Entry<String, Int> in productsSold.entries) {
        val amount = entry.value

        println("${entry.key}: $${amount}")

        totalIncome += amount
    }

    println()
    println("Income: $$totalIncome")
    println("Staff expenses:")
    totalIncome -= readln().toInt()

    println("Other expenses:")
    totalIncome -= readln().toInt()

    println("Net income: $$totalIncome")
}