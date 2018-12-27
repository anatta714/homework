package com.train

import java.util.*

fun main(args: Array<String>) {

    var scan = Scanner(System.`in`)
    println("Please enter number of tickets: ")
    var tickets = scan.nextInt()

    println("How many round-trip tickets: ")
    var roundtrip = scan.nextInt()

    var ticket = Tickets(tickets,roundtrip)
    ticket.print()
}

class Tickets(var tickets:Int, var roundtrip:Int){

    fun print(){
        println("Total Tickets: $tickets")
        println("Round-trip: $roundtrip")
        println("Total: " + ((tickets-roundtrip)+(roundtrip*2))*925)
    }
}