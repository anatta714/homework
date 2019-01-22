package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tickets= 0 ;
        int roundtrip = 0;

        do {
            System.out.print("Please enter number of tickets:");
            tickets = scan.nextInt();

            if (tickets != -1) {
                System.out.print("How many round-trip tickets:");
                roundtrip = scan.nextInt();

                while(roundtrip>tickets){
                    System.out.println("Round-trip ticket are more than the tickets !!");
                    System.out.print("How many round-trip tickets: ");
                    roundtrip = scan.nextInt();
                }
                Ticket ticket = new Ticket(tickets, roundtrip);
                ticket.print();
            }else{
                System.out.print("Thank you.");
            }
        }while(tickets != -1);
    }
}
