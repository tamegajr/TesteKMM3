package br.com.tamegatech.testekmm3

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}