package app

import data.ExcecutiveCustomer
import data.PremiumCustomer

fun main() {

    val premiumcustomer = PremiumCustomer("DONI")
    println(premiumcustomer.name)

    val excecutiveCustomer = ExcecutiveCustomer("RYANS", 15000000 )
    println(excecutiveCustomer.name)
    println(excecutiveCustomer.balance)








}