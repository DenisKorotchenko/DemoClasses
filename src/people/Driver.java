package people;

public class Driver extends Staff {
    int trainNum;
    Driver(String fullName) {
        super(fullName);
        trainNum = (int)date.getTime()%100;
    }
}
