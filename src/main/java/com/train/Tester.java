package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter number of tickets:");
        int tickets = scan.nextInt();

        System.out.println("How many round-trip tickets:");
        int roundtrip = scan.nextInt();

        Ticket ticket = new Ticket(tickets,roundtrip);
        ticket.print();
    }
}
