package people;

import static people.Gender.male;

public class Human {
    private final Gender gender;
    Human(){
        gender = male;
    }
    Human(Gender gender){
        this.gender = gender;
    }
}
