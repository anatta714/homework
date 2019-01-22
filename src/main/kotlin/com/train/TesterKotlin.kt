package com.train

import java.util.*

fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var tickets:Int
    var roundtrip:Int

    do{
        print("Please enter number of tickets: ")
        tickets = scan.nextInt()

        if(tickets != -1){
            print("How many round-trip tickets: ")
            roundtrip = scan.nextInt()

            while(roundtrip>tickets){
                println("Round-trip ticket are more than the tickets !!")
                print("How many round-trip tickets: ")
                roundtrip = scan.nextInt()
            }
            var ticket = Tickets(tickets,roundtrip)
            ticket.print()
        }else{
            println("Thank you.")
        }
    }while(tickets != -1)
}

class Tickets(var tickets:Int, var roundtrip:Int){

    fun print(){
        println("Total Tickets: $tickets")
        println("Round-trip: $roundtrip")
        println("Total: " + ((tickets-roundtrip)+(roundtrip*2))*925)
        println()
    }
}