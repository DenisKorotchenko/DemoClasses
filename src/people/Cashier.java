package people;

public class Cashier extends Staff {
    int cashNum;
    public Cashier(String fullName) {
        super(fullName);
        cashNum = (int)date.getTime()%10;
    }
}
