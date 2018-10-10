package people;

public class Conductor extends Staff {
    int trainNum;
    Conductor(String fullName) {
        super(fullName);
        trainNum = (int)date.getTime()%100;
    }
}
