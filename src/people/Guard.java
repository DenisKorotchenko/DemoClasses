package people;

public class Guard extends Staff {
    boolean haveGun;

    Guard(String fullName) {
        super(fullName);
        haveGun = (date.getTime()%2==0);
    }
}
