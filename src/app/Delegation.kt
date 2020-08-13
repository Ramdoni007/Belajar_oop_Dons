package app

import data.Base
import data.MyBaseDelegate
import data.myBase

fun main() {
    val base =myBase()
    base.sayHellow("Downy")


    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHellow("Joko")
    baseDelegate.sayGoodbay("Budi")




}