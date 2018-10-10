package people;

import java.util.Date;

public class Staff extends Human {
    private long id;
    private String fullName;
    private boolean status = false;
    protected Date date = new Date();
    Staff(String fullName){
        id = date.getTime()%12445123;
        this.fullName = fullName;
    }
    Staff(long id, String fullName){
        this.fullName = fullName;
        this.id = id;
    }
    public void startWorking(){
        status = true;
    }
    public void finishWorking(){
        status = false;
    }
}
