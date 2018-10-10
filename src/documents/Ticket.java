package documents;

public class Ticket {
    private long number;
    private long train;
    private long seat;
    private Passport passenger;
    public Ticket(long train, long seat, Passport passenger){
        this.train = train;
        this.seat = seat;
        this.passenger = passenger;
    }

    public Ticket(Passport passport) {
        passenger = passport;
    }

    public boolean checkPassport(Passport passport){
        return passport.checkAll(passport);
    }
}
