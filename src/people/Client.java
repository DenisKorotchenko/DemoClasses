package people;

import javax.xml.crypto.Data;
import java.sql.Time;
import java.util.Date;

public class Client extends Human{
    long timeIn;
    long timeOut = -1;
    boolean finishStatus = false; //
    Date date = new Date();
    Client(){
        super();
    }
    Client(Gender gender) {
        super(gender);
        timeIn = date.getTime();
    }
    public boolean finishWork(){
        if (finishStatus){
            return false;
        }
        timeOut = date.getTime();
        finishStatus = true;
        return true;
    }
    public long workTime(){
        if (finishStatus)
            return timeOut-timeIn;
        return date.getTime() - timeIn;
    }
    public long getTimeIn(){
        return timeIn;
    }
}
