package people;

import documents.Passport;
import documents.Ticket;

public class Passenger extends Client{
    private Passport passport;
    private Ticket ticket;
    boolean inTrain = false;
    public Passenger(Gender gender, Passport passport, Ticket ticket) {
        super(gender);
        this.passport = passport;
        this.ticket = ticket;
    }
    public Ticket checkTicket(){
        return this.ticket;
    }
    public Passport checkPassport(){
        return this.passport;
    }
    public boolean Board(){
        if (!ticket.checkPassport(passport))
            return false;
        inTrain = true;
        return true;
    }
}
