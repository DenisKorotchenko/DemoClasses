package com.company;

import documents.Passport;
import documents.Ticket;
import people.Client;
import people.Gender;
import people.Passenger;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	    LinkedList<Client> clients = new LinkedList<>();
	    clients.add(new Passenger(Gender.male, new Passport("IvanovIvan", 550987), new Ticket(1, 1, new Passport("IvanovIvan", 550987))) );

    }
}
