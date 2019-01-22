package com.train;

public class Ticket {
    int tickets;
    int roundTrip;

    Ticket(int tickets, int roundTrip){
        this.tickets = tickets;
        this.roundTrip = roundTrip;
    }


    void print(){

        System.out.println("Total Tickets: " + tickets);
        System.out.println("Round-trip: " + roundTrip);
        System.out.println("Total: " + ((tickets-roundTrip) + (roundTrip * 2))*925);
        System.out.println();
    }

}
