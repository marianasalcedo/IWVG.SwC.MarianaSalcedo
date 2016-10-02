package es.upm.miw.spai.ecp2;

import java.time.LocalDate;
import java.time.Period;

public class User {
    
    private int number;
    private String name;
    private String familyName;
    private LocalDate bornDate;

    private String format(String string) {
        string = string.trim();
        return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    public User(int number, String name, String familyName, LocalDate bornDate) {
        this.number = number;
        this.name = this.format(name);
        this.familyName = this.format(familyName);
        this.bornDate = bornDate;
    }
    
    public int getAge(){
        return Period.between(this.bornDate, LocalDate.now()).getYears();
    }

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public String fullName() {
        return this.name + " " + this.familyName;
    }

    public String initials() {
        return this.name.substring(0, 1) + ".";
    }
}
