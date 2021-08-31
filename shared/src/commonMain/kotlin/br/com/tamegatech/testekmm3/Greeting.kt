package br.com.tamegatech.testekmm3

import kotlinx.datetime.*

class Greeting {
    fun greeting(): String {
//        val response: String
//        response=""
        return "Hello, ${Platform().platform}!" +
        " Faltam ${daysUntilNewYear()} para o Ano Novo"

    }

    fun daysUntilNewYear (): Int{
        val today = Clock.System.todayAt(TimeZone.currentSystemDefault())
        val closestNewYear = LocalDate(today.year+1,1,1)
        return today.daysUntil(closestNewYear)
    }
}