package documents;

public class Passport {
    private String fullName;
    private long number;
    public Passport(String fullName, long number){
        this.fullName = fullName;
        this.number = number;
    }
    private boolean checkName(String name){
        return name.equals(this.fullName);
    }
    private boolean checkNumber(long number){
        return this.number == number;
    }
    public boolean checkAll(String name, long number){
        return checkName(name)&&(checkNumber(number));
    }

    public boolean checkAll(Passport passport) {
        return passport.checkAll(this.fullName, this.number);
    }
}
