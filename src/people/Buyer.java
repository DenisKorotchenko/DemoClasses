package people;

import documents.Passport;
import documents.Ticket;
import java.util.LinkedList;

public class Buyer extends Client{
    LinkedList<Ticket> tickets = new LinkedList<Ticket>();

    Buyer(Gender gender) {
        super(gender);
    }

    public void buyTicket(long train, long seat, Passport passport){
        Ticket ticket = new Ticket(train, seat, passport);
        tickets.add(ticket);
    }
}
